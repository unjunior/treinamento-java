package xti;

public class Carro {

	public String modelo;
	public int velocidadeMaxima;
	public double segundosZeroACem;
	public Motor motor;

	public Carro() {
	
	}

	/*
	 * public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
	 * this.modelo = modelo; this.velocidadeMaxima = velocidadeMaxima;
	 * this.segundosZeroACem = segundosZeroACem; }
	 */
	/*
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this(modelo, velocidadeMaxima, segundosZeroACem, null);
		
	}
	 */
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor) {
		this(modelo, velocidadeMaxima, segundosZeroACem);
		this.motor = motor;
	}

}
