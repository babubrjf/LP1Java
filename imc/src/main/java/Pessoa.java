public class Pessoa implements DadosPessoa {

	private static final String SEX_FEM = "F";
	private static final String SEX_MASC = "M";
	private static final CalculadoraImc CALCULADORA_IMC = new CalculadoraImc();

	private double peso;
	private String sexo;
	private double altura;

	public Pessoa() {
	}

	public Pessoa(double peso, String sexo, double altura) {
		setPeso(peso);
		setSexo(sexo);
		setAltura(altura);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (!Double.isFinite(peso) || peso <= 0) {
			throw new IllegalArgumentException("Peso deve ser maior que zero");
		}
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if (sexo == null) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}

		String sexoNormalizado = sexo.trim().toUpperCase();
		if (!SEX_FEM.equals(sexoNormalizado)
				&& !SEX_MASC.equals(sexoNormalizado)) {
			throw new IllegalArgumentException("Sexo deve ser F ou M");
		}
		this.sexo = sexoNormalizado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (!Double.isFinite(altura) || altura <= 0) {
			throw new IllegalArgumentException("Altura deve ser maior que zero");
		}
		this.altura = altura;
	}

	public String calcularImc() {
		return CALCULADORA_IMC.classificar(this);
	}
}
