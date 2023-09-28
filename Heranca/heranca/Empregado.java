package heranca;

public class Empregado extends Pessoa{
	int codigoSetor;
	double salarioBase;
	double imposto;
	
	public Empregado(String nome, String telefone, String endereco, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, telefone, endereco);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	double calcularSalario() {
		double salario = salarioBase - (salarioBase * (imposto / 100));
		return salario;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\n"
		+ "Telefone: " + getTelefone() + "\n"
		+ "Endereco: " + getEndereco() + "\n"
		+ "Código: " + getCodigoSetor() + "\n"
		+ "Salario Base: " + getSalarioBase() + "\n"
		+ "Imposto: " + getImposto() + "\n"
		+ "Salario liquido: R$" + calcularSalario() + "\n";
		
	}
}
