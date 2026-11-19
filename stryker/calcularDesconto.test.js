const calcularDesconto = require('./calcularDesconto');

test("Deve testar 15% de desconto", () => {
	expect(calcularDesconto(true, 'ouro', 550)).toBe(15);
});

test("Deve testar 10% de desconto", () => {
	expect(calcularDesconto(true, 'prata', 450)).toBe(10);
});

test("Deve testar 5% de desconto", () => {
	expect(calcularDesconto(false, 'bronze', 300)).toBe(5);
});

test("Deve testar 0% de desconto", () => {
	expect(calcularDesconto(false, 'n/a', 150)).toBe(0);
});

test("Deve testar 15% de desconto em compra maior ou igual a 500", () => {
	expect(calcularDesconto(false, 'ouro', 550)).toBe(15);
});

test("Deve testar 15% de desconto com cliente tipo ouro", () => {
	expect(calcularDesconto(false, 'ouro', 450)).toBe(15);
});

test("Deve testar 10% de desconto com cliente tipo prata", () => {
	expect(calcularDesconto(false, 'prata', 350)).toBe(10);
});

test("Deve testar 10% de desconto caso seja a primeira Compra", () => {
	expect(calcularDesconto(true, 'bronze', 350)).toBe(10);
});

test("Deve testar 10% de desconto em compra maior ou igual a 400", () => {
	expect(calcularDesconto(false, 'bronze', 450)).toBe(10);
});

test("Deve testar 5% de desconto em compra maior ou igual a 200", () => {
	expect(calcularDesconto(false, 'n/a', 250)).toBe(5);
});

test("Deve testar 5% de desconto com cliente tipo bronze", () => {
	expect(calcularDesconto(false, 'bronze', 150)).toBe(5);
});

test("Deve testar 0% de desconto", () => {
	expect(calcularDesconto(false, 'madeira', 150)).toBe(0);
});

test("Deve testar 15% de desconto com cliente tipo bronze", () => {
	expect(calcularDesconto(false, 'bronze', 500)).toBe(15);
});

test("Deve testar 10% de desconto em compra igual a 400", () => {
	expect(calcularDesconto(false, 'bronze', 400)).toBe(10);
});

test("Deve testar 5% de desconto", () => {
	expect(calcularDesconto(false, 'madeira', 200)).toBe(5);
});