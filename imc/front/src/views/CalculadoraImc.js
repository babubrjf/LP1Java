import { useState } from 'react';
import Card from '../components/Card';
import FormGroup from '../components/FormGroup';
import { calcularImc } from '../services/imcApi';

function CalculadoraImc() {
	const [peso, setPeso] = useState('');
	const [altura, setAltura] = useState('');
	const [sexo, setSexo] = useState('');
	const [resultado, setResultado] = useState(null);
	const [erro, setErro] = useState('');
	const [carregando, setCarregando] = useState(false);

	async function calcular(event) {
		event.preventDefault();
		setCarregando(true);
		setErro('');
		setResultado(null);

		try {
			const resposta = await calcularImc({
				peso: Number(peso),
				altura: Number(altura),
				sexo,
			});
			setResultado(resposta);
		} catch (error) {
			setErro(error.message);
		} finally {
			setCarregando(false);
		}
	}

	return (
		<Card title="Calcular IMC">
			<p className="text-secondary">Informe peso, altura e sexo para calcular o IMC.</p>

			<form className="imc-form" onSubmit={calcular}>
				<FormGroup label="Peso (em kg): *" htmlFor="peso">
					<input
						className="form-control"
						id="peso"
						type="number"
						min="0.01"
						step="0.01"
						value={peso}
						onChange={(event) => setPeso(event.target.value)}
						required
					/>
				</FormGroup>

				<FormGroup label="Altura (em metros): *" htmlFor="altura">
					<input
						className="form-control"
						id="altura"
						type="number"
						min="0.01"
						step="0.01"
						value={altura}
						onChange={(event) => setAltura(event.target.value)}
						required
					/>
				</FormGroup>

				<FormGroup label="Sexo: *" htmlFor="sexo">
					<select
						className="form-select"
						id="sexo"
						value={sexo}
						onChange={(event) => setSexo(event.target.value)}
						required
					>
						<option value="">Selecione</option>
						<option value="F">Feminino</option>
						<option value="M">Masculino</option>
					</select>
				</FormGroup>

				<div className="form-actions">
					<button className="btn btn-success" type="submit" disabled={carregando}>
						{carregando ? 'Calculando...' : 'Calcular'}
					</button>
				</div>
			</form>

			{erro && <div className="alert alert-danger mt-4" role="alert">{erro}</div>}

			{resultado && (
				<div className="alert alert-success mt-4 text-center" role="status">
					<div className="result-value">{resultado.imc}</div>
					<p className="result-label">{resultado.classificacao}</p>
				</div>
			)}
		</Card>
	);
}

export default CalculadoraImc;
