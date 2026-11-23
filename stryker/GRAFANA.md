### Checklist técnico verificado

* **Consistência entre `load.js` e a regra de negócio:** Os 4 cenários rotacionados via `__ITER % cenarios.length` em `k6/load.js` exercitam todas as faixas de retorno de `calcularDesconto.js` (`0`, `5`, `10` e `15`), e os valores esperados batem com a implementação:


* `(false, 'bronze', 300)` → `5`


* `(true, 'bronze', 350)` → `10`


* `(false, 'ouro', 100)` → `15`


* `(false, 'n/a', 150)` → `0`




* **Controle de ritmo no `smoke.js`:** O `sleep(1)` foi adicionado ao final da iteração, evitando o loop frenético contra a API local.


* **Script `test:k6:load` portável:** O comando no `package.json` usa `node -e` com `spawnSync` e apenas aspas simples internamente, funcionando sem conflito de escape tanto no Windows quanto em Linux/macOS e preservando o *exit code* do k6.


* **Isolamento intacto:** `stryker.config.json` muta apenas `./*.js` excluindo `!./*.test.js` e `!k6/**/*.js`, e o Jest ignora `/k6/` na cobertura (e não executa os scripts do k6 porque nenhum termina em `.test.js`).


* **Servidor HTTP (`k6/server.js`):** Validação de tipos, `Number.isFinite` e `valorCompra < 0` protegidos por `try/catch` devolvendo `400`, mantendo `node:http` sem dependências externas.



---

### Dois detalhes menores (não bloqueantes)

* **Erro silencioso se o `k6` não estiver no `PATH`:** No `test:k6:load`, se quem avaliar o projeto rodar o comando sem o binário `k6` instalado, `spawnSync` retorna `r.status === null` e encerra com código `1` sem imprimir mensagem. Só vale mexer se quiser ser extra defensivo (adicionando `if (r.error) console.error(r.error.message);`).


* **`.gitignore` e `run.txt`:** Confirme que `k6/report.html` está no `.gitignore` antes de commitar. O `run.txt` ainda lista apenas os comandos de Jest e Stryker — se o professor usar esse arquivo como cola de execução, vale adicionar os comandos do k6 nele também (ou deixar só no `k6/README.md`).



### Validação final antes da entrega

Execute esta sequência para garantir que nada quebrou em conjunto:

1. `npm run test` e `npm run mutacao` (confirmar 100% dos testes passando e *mutation score* inalterado).


2. Terminal 1: `npm run start:k6-server`.


3. Terminal 2: `npm run test:k6:smoke` e depois `npm run test:k6:load` — conferir se `k6/report.html` foi gerado e se todos os `checks` e `thresholds` fecharam verdes.