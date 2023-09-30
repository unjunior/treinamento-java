package exerciciosPolimorfismo.questao3;

public class Veterinario {
	
	public String examinar(Animal animal) {
		return
			"examinei o animal \n" +
			"Nome: " + animal.nome + "\n" +
			"Idade: " + animal.idade + "\n" +
			"Tipo: " + animal.tipo + "\n" +
			animal.somDoAnimal();
	}
	
}
