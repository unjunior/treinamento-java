package interfaces.classesComuns;

import interfaces.classesAbstratas.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB{

	
	public Cachorro() {
		super();
		
	}

	public Cachorro(float quantidadeComida, float quantidadePercorrida, int horas) {
		super(quantidadeComida, quantidadePercorrida, horas);
		
	}

	@Override
	public void comer() {
		System.out.println("CACHORRO COMEU: " + this.getQuantidadeComida() +" KG" + " de comida");
		
	}

	@Override
	public void mover() {
		System.out.println("CACHORRO CORREU: " + this.getQuantidadePercorrida() +" KM");
		
	}

	@Override
	public void dormir() {
		System.out.println("CACHORRO DORMIU POR " +this.getHoras() + " HORAS");
		
	}	
}
