package xti;

public class Program {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari de formula 1";
		ferrari.velocidadeMaxima = 350;
		ferrari.segundosZeroACem = 3.2;
		
		Motor motorFerrari = new Motor();
		motorFerrari.tipo = "motor V Power";
		motorFerrari.potencia = 800;
		
		ferrari.motor = motorFerrari; // adiciona o motor ao carro
		
		System.out.println(ferrari.motor.tipo); 
		System.out.println(ferrari.motor.potencia);
		
		
		Carro ka = new Carro("ford", 180, 10);
		Motor _4cilindos = new Motor("4 cilindros", 350);
		
		ka.motor = _4cilindos;
		
		System.out.println(ka.modelo);
		System.out.println(ka.motor.tipo);
		
		Carro kombi = new Carro("wolks", 150, 30, new Motor("tipo kombi", 200));
		System.out.println(kombi.modelo);
		System.out.println(kombi.motor.potencia);
		
	}

}
