package exerciciosPolimorfismo.questao4;

public class Leao extends Animal{

	@Override
	public String somDoAnimal() {
		return "som do leão";
	}
	
	@Override
	public String correr() {
		return "o leão correu";
	}
}
