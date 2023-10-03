package interfaces.classesAbstratas;

public abstract class AnimalAB implements AnimalIF{
	
	private float quantidadeComida;
	private float quantidadePercorrida;
	private int horas;
	
	
	public AnimalAB() {
		
	}
	
	public AnimalAB(float quantidadeComida, float quantidadePercorrida, int horas) {
		
		this.quantidadeComida = quantidadeComida;
		this.quantidadePercorrida = quantidadePercorrida;
		this.horas = horas;
	}
	
	public float getQuantidadeComida() {
		return quantidadeComida;
	}
	public void setQuantidadeComida(float quantidadeComida) {
		this.quantidadeComida = quantidadeComida;
	}
	public float getQuantidadePercorrida() {
		return quantidadePercorrida;
	}
	public void setQuantidadePercorrida(float quantidadePercorrida) {
		this.quantidadePercorrida = quantidadePercorrida;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
}
