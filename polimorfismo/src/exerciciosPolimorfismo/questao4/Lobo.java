package exerciciosPolimorfismo.questao4;

public class Lobo extends Animal{

	@Override
	public String somDoAnimal() {
		return "som do lobo";
	}
	
	@Override
	public String correr() {
		return "o lobo correu";
	}
	
	
}
