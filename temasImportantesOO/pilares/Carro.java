package temasBasicos.pilares;

public class Carro {

	public void ligar() {
		confereMarcha();
		confereCambio();
		System.out.println("carro ligado!");
	}
	
	private void confereMarcha() {
		System.out.println("CONFERINDO MARCHA... OK!"); 
	}
	
	private void confereCambio() {
		System.out.println("CONFERINDO CAMBIO... OK!");
	}
}
