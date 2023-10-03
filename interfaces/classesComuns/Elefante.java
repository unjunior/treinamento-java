package interfaces.classesComuns;

import interfaces.classesAbstratas.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB{
	
	
	@Override
	public void comer() {
		System.out.println("ELEFANTE COMEU: " + this.getQuantidadeComida() +" KG" + " de comida");
		
	}

	public Elefante() {
		super();
		
	}

	public Elefante(float quantidadeComida, float quantidadePercorrida, int horas) {
		super(quantidadeComida, quantidadePercorrida, horas);
		
	}

	@Override
	public void mover() {
		System.out.println("ELEFANTE CORREU: " + this.getQuantidadePercorrida() +" KM");
		
	}

	@Override
	public void dormir() {
		System.out.println("ELEFANTE DORMIU POR " +this.getHoras() + " HORAS");
		
	}

}

