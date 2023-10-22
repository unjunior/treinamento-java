package xti.temVarios;

public class Teste {

	public static void main(String[] args) {


		Pessoa p1 = new Pessoa("Joao", 39);
		Carro c1 = new Carro("gol", "prata");
		Carro c2 = new Carro("corsa", "azul");
		
		p1.carros.add(c1);
		p1.carros.add(c2);
		
		
		System.out.println(p1.carros);

	}

}


//p1.carros = c1;