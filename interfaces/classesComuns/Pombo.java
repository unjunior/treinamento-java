package interfaces.classesComuns;

import interfaces.classesAbstratas.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB{
	
	public Pombo(String cor) {
		super(cor);
	}
	
	public Pombo(float quantidadeComida, float quantidadePercorrida, int horas, String cor) {
		super(quantidadeComida, quantidadePercorrida, horas, cor);
	}
	@Override
	public void comer() {
		System.out.println("POMBO COMEU: " + this.getQuantidadeComida() +" KG" + " de comida");
		
	}

	@Override
	public void mover() {
		System.out.println("POMBO CORREU: " + this.getQuantidadePercorrida() +" KM");
		
	}

	@Override
	public void dormir() {
		System.out.println("POMBO DORMIU POR " +this.getHoras() + " HORAS");
		
	}	
	
	@Override
	public void voar() {
		System.out.println("O POMBO VOOU ALTO!");
		
	}

}
