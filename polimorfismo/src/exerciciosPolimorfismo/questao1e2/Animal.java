package exerciciosPolimorfismo.questao1e2;

public abstract class Animal {

	public String nome;
	public int idade;
	
	
	public abstract String emiteSom();
	
	public String correr() {
		return "DEVE CORRER";
	}

}
