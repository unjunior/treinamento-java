package interfaces.classesAbstratas;

public abstract class AnimalMarinhoAB extends AnimalAB{

	public AnimalMarinhoAB() {
		super();
		
	}

	public AnimalMarinhoAB(float quantidadeComida, float quantidadePercorrida, int horas) {
		super(quantidadeComida, quantidadePercorrida, horas);
		
	}
	
	public abstract void nadar();
}
