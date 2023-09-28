package heranca;

public class Administrador extends Empregado{

	private double ajudaDeCusto;

	public Administrador(String nome, String telefone, String endereco, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + ajudaDeCusto;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Ajuda de custo: " + getAjudaDeCusto() + "\n"
				+ "Salario do Administrador: " + calcularSalario();
	}


}
