package exerciciosPolimorfismo.questao1e2;

public class AnimalTeste {

	public static void main(String[] args) {

		
		System.out.println("-----------CACHORRO--------------");
		chamarCachorro();
		
		System.out.println();
		
		System.out.println("-----------CAVALO--------------");
		chamarCavalo();
		System.out.println();
		System.out.println("-----------PREGUIÇA--------------");
		chamarPreguica();
		
	}
	
	public static void chamarCachorro() {
		Animal cachorro = new Cachorro();
		System.out.println(cachorro.nome = "dog");
		System.out.println(cachorro.idade = 4);
		System.out.println(cachorro.correr());
		System.out.println(cachorro.emiteSom());
	}
	
	public static void chamarCavalo() {
		
		Animal cavalo = new Cavalo();
		System.out.println(cavalo.nome = "alazão");
		System.out.println(cavalo.idade =10);
		System.out.println(cavalo.correr());
		System.out.println(cavalo.emiteSom());
	}
	
	public static void chamarPreguica() {
		Preguica preguica = new Preguica();
		System.out.println(preguica.nome = "Pregui");
		System.out.println(preguica.idade = 7);
		System.out.println(preguica.subirEmArvores());
		System.out.println(preguica.emiteSom());
		
	}
}
