package interfaces.classesComuns;

import interfaces.classesAbstratas.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB{
	
	public Peixe() {
		super();
	}
	
	public Peixe(float quantidadeComida, float quantidadePercorrida, int horas) {
		super(quantidadeComida, quantidadePercorrida, horas);
	}
	
	@Override
	public void comer() {
		System.out.println("PEIXE COMEU: " + this.getQuantidadeComida() +" KG" + " de comida");
		
	}

	@Override
	public void mover() {
		System.out.println("PEIXE CORREU: " + this.getQuantidadePercorrida() +" KM");
		
	}

	@Override
	public void dormir() {
		System.out.println("PEIXE DORMIU POR " +this.getHoras() + " HORAS");
		
	}	
	@Override
	public void nadar() {
		System.out.println("O PEIXE NADOU NO OCEANO");
		
	}
}
