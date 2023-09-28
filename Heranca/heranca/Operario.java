package heranca;

public class Operario extends Empregado{

	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String telefone, String endereco, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double producaoOperario() {
		double total = valorProducao + (valorProducao * comissao/100);
		return total;
			
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() + producaoOperario();
	}
	
	
	
}
