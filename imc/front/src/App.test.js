import { fireEvent, render, screen, waitFor } from '@testing-library/react';
import App from './App';

afterEach(() => {
  jest.restoreAllMocks();
});

test('calcula e exibe o resultado retornado pela API', async () => {
  jest.spyOn(global, 'fetch').mockResolvedValue({
    ok: true,
    json: async () => ({ imc: 22.86, classificacao: 'No peso normal' }),
  });

  render(<App />);

  fireEvent.change(screen.getByLabelText(/peso/i), { target: { value: '70' } });
  fireEvent.change(screen.getByLabelText(/altura/i), { target: { value: '1.75' } });
  fireEvent.change(screen.getByLabelText(/sexo/i), { target: { value: 'M' } });
  fireEvent.click(screen.getByRole('button', { name: /calcular imc/i }));

  await waitFor(() => expect(screen.getByText('22.86')).toBeInTheDocument());
  expect(screen.getByText('No peso normal')).toBeInTheDocument();
});
