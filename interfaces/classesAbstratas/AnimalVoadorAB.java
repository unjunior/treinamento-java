package interfaces.classesAbstratas;

public abstract class AnimalVoadorAB extends AnimalAB{
	
	private String cor;
	
	public AnimalVoadorAB() {
		super();
		
	}

	public AnimalVoadorAB(float quantidadeComida, float quantidadePercorrida, int horas, String cor) {
		super(quantidadeComida, quantidadePercorrida, horas);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public AnimalVoadorAB(String cor) {
		this.cor = cor;
	}
	
	public abstract void voar();
}
