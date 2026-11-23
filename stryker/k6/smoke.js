import http from 'k6/http';
import { check } from 'k6';

const BASE_URL = (__ENV.BASE_URL || 'http://localhost:3000').replace(/\/+$/, '');
const payload = JSON.stringify({
	primeiraCompra: false,
	tipoCliente: 'bronze',
	valorCompra: 300,
});

export const options = {
	vus: 2,
	duration: '15s',
	thresholds: {
		http_req_failed: ['rate<0.01'],
		http_req_duration: ['p(95)<100'],
	},
};

export default function () {
	const healthResponse = http.get(`${BASE_URL}/health`);
	check(healthResponse, {
		'GET /health retorna 200': (response) => response.status === 200,
		'GET /health retorna status ok': (response) => response.json('status') === 'ok',
	});

	const descontoResponse = http.post(`${BASE_URL}/desconto`, payload, {
		headers: { 'Content-Type': 'application/json' },
	});
	check(descontoResponse, {
		'POST /desconto retorna 200': (response) => response.status === 200,
		'POST /desconto calcula 5%': (response) => response.json('desconto') === 5,
	});
}
