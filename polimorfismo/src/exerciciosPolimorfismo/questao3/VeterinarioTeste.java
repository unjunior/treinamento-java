package exerciciosPolimorfismo.questao3;

public class VeterinarioTeste {

	public static void main(String[] args) {
		
		Veterinario veterinario = new Veterinario();
		
		Animal cao = new Cachorro();
		cao.nome = "meg";
		cao.idade = 2;
		cao.tipo = "Cachorro";
		
		Animal gato = new Gato();
		gato.nome = "marisco";
		gato.idade = 5;
		gato.tipo = "Gato";
		
		Animal galinha = new Galinha();
		galinha.nome = "piu";
		galinha.idade = 3;
		galinha.tipo = "Galinha";
		
		
		System.out.println(veterinario.examinar(cao));
		System.out.println();
		System.out.println(veterinario.examinar(gato));
		System.out.println();
		System.out.println(veterinario.examinar(galinha));
		
		
		
		
	}

}
