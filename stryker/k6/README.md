# Testes de carga com k6

## Pré-requisitos

- Node.js para executar o servidor local.
- Binário `k6` disponível no `PATH`. No Windows: `winget install k6 --source winget`.

Sem instalação local do k6, execute o smoke test via Docker:

```powershell
docker run --rm --add-host=host.docker.internal:host-gateway -e BASE_URL=http://host.docker.internal:3000 -v "${PWD}/k6:/scripts" grafana/k6 run /scripts/smoke.js
```

## Execução

Em um terminal, inicie a API:

```bash
npm run start:k6-server
```

Em outro terminal, execute um dos cenários:

```bash
npm run test:k6:smoke
npm run test:k6:load
```

O teste de carga disponibiliza o dashboard em `http://localhost:5665` e gera `k6/report.html` ao terminar.

Para testar outra instância, defina `BASE_URL` antes da execução. Exemplo no PowerShell:

```powershell
$env:BASE_URL = 'http://localhost:3000'
npm run test:k6:smoke
```

## Resultados

- `checks`: validam status HTTP e conteúdo básico. O esperado é `100%` de sucesso.
- `http_req_failed`: o teste falha se a taxa de requisições HTTP com erro atingir `1%`.
- `http_req_duration`: o teste falha se o percentil 95 de latência atingir `100 ms`.

Falha em qualquer `threshold` faz o k6 encerrar com código diferente de zero.
