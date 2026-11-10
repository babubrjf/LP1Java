export async function calcularImc(dados) {
  const apiUrl = process.env.REACT_APP_API_URL || 'http://localhost:8080';
  const response = await fetch(`${apiUrl}/api/imc`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(dados),
  });

  const body = await response.json().catch(() => null);
  if (!response.ok) {
    throw new Error(body?.erro || 'Não foi possível calcular o IMC.');
  }
  return body;
}
