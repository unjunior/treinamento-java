package interfaces.classesComuns;

import interfaces.classesAbstratas.AnimalTerrestreAB;

public class Gato extends AnimalTerrestreAB{
	
	
	public Gato() {
		super();
		
	}

	public Gato(float quantidadeComida, float quantidadePercorrida, int horas) {
		super(quantidadeComida, quantidadePercorrida, horas);
		
	}

	@Override
	public void comer() {
		System.out.println("GATO COMEU: " + this.getQuantidadeComida() +" KG" + " de comida");
		
	}

	@Override
	public void mover() {
		System.out.println("GATO CORREU: " + this.getQuantidadePercorrida() +" KM");
		
	}

	@Override
	public void dormir() {
		System.out.println("GATO DORMIU POR " +this.getHoras() + " HORAS");
		
	}	

}
