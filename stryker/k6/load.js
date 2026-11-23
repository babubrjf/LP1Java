import http from 'k6/http';
import { check, sleep } from 'k6';

const BASE_URL = (__ENV.BASE_URL || 'http://localhost:3000').replace(/\/+$/, '');
const payload = JSON.stringify({
	primeiraCompra: false,
	tipoCliente: 'bronze',
	valorCompra: 300,
});

export const options = {
	stages: [
		{ duration: '20s', target: 20 },
		{ duration: '30s', target: 20 },
		{ duration: '10s', target: 0 },
	],
	thresholds: {
		http_req_failed: ['rate<0.01'],
		http_req_duration: ['p(95)<100'],
	},
};

export default function () {
	const response = http.post(`${BASE_URL}/desconto`, payload, {
		headers: { 'Content-Type': 'application/json' },
	});

	check(response, {
		'POST /desconto retorna 200': (result) => result.status === 200,
		'POST /desconto calcula 5%': (result) => result.json('desconto') === 5,
	});

	sleep(1);
}
