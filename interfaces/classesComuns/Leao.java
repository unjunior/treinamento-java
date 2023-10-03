package interfaces.classesComuns;

import interfaces.classesAbstratas.AnimalTerrestreAB;

public class Leao extends AnimalTerrestreAB{

	
	public Leao() {
		super();
	}
	
	public Leao(float quantidadeComida, float quantidadePercorrida, int horasDeSono) {
		super(quantidadeComida, quantidadePercorrida,horasDeSono);
	}

	@Override
	public void comer() {
		System.out.println("LEÃO COMEU: " + this.getQuantidadeComida() +" KG" + " de comida");
		
	}

	@Override
	public void mover() {
		System.out.println("LEÃO CORREU: " + this.getQuantidadePercorrida() +" KM");
		
	}

	@Override
	public void dormir() {
		System.out.println("LEÃO DORMIU POR " +this.getHoras() + " HORAS");
		
	}	

}
