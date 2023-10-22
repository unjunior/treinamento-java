package xti.temVarios;

public class Carro {
	public String modelo;
	public String cor;
	
	public Carro() {
		
	}
	public Carro(String modelo, String cor) {
		
		this.modelo = modelo;
		this.cor = cor;
	}
	
	
	public String toString() {
		return "Nome: " + modelo + ", Cor: " + cor;
				
	}
	
}
