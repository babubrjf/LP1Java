const http = require('node:http');
const calcularDesconto = require('../calcularDesconto');

const PORT = Number(process.env.PORT) || 3000;

function responder(response, statusCode, payload) {
	response.writeHead(statusCode, { 'Content-Type': 'application/json; charset=utf-8' });
	response.end(JSON.stringify(payload));
}

function validarEntrada({ primeiraCompra, tipoCliente, valorCompra }) {
	if (
		typeof primeiraCompra !== 'boolean' ||
		typeof tipoCliente !== 'string' ||
		tipoCliente.length === 0 ||
		typeof valorCompra !== 'number' ||
		!Number.isFinite(valorCompra) ||
		valorCompra < 0
	) {
		throw new TypeError('Entrada inválida');
	}
}

const server = http.createServer((request, response) => {
	if (request.method === 'GET' && request.url === '/health') {
		responder(response, 200, { status: 'ok' });
		return;
	}

	if (request.method === 'POST' && request.url === '/desconto') {
		let body = '';

		request.setEncoding('utf8');
		request.on('data', (chunk) => {
			body += chunk;
		});
		request.on('end', () => {
			try {
				const entrada = JSON.parse(body);
				validarEntrada(entrada);
				const desconto = calcularDesconto(
					entrada.primeiraCompra,
					entrada.tipoCliente,
					entrada.valorCompra,
				);

				responder(response, 200, { desconto });
			} catch {
				responder(response, 400, { erro: 'Entrada inválida' });
			}
		});
		return;
	}

	responder(response, 404, { erro: 'Rota não encontrada' });
});

server.listen(PORT, () => {
	console.log(`Servidor k6 disponível em http://localhost:${PORT}`);
});
