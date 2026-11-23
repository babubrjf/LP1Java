import http from 'k6/http';
import { check, sleep } from 'k6';

const BASE_URL = (__ENV.BASE_URL || 'http://localhost:3000').replace(/\/+$/, '');
const cenarios = [
	{
		payload: { primeiraCompra: false, tipoCliente: 'bronze', valorCompra: 300 },
		esperado: 5,
	},
	{
		payload: { primeiraCompra: true, tipoCliente: 'bronze', valorCompra: 350 },
		esperado: 10,
	},
	{
		payload: { primeiraCompra: false, tipoCliente: 'ouro', valorCompra: 100 },
		esperado: 15,
	},
	{
		payload: { primeiraCompra: false, tipoCliente: 'n/a', valorCompra: 150 },
		esperado: 0,
	},
];

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
	const cenario = cenarios[__ITER % cenarios.length];
	const response = http.post(`${BASE_URL}/desconto`, JSON.stringify(cenario.payload), {
		headers: { 'Content-Type': 'application/json' },
	});

	check(response, {
		'POST /desconto retorna 200': (result) => result.status === 200,
		'POST /desconto calcula o valor esperado': (result) =>
			result.json('desconto') === cenario.esperado,
	});

	sleep(1);
}
