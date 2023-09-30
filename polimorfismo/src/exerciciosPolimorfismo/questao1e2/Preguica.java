package exerciciosPolimorfismo.questao1e2;

public class Preguica extends Animal{
		
	public String subirEmArvores() {
		return "subindo bem devagar porque tenho preguiça";
	}
	
	@Override
	public String emiteSom() {
			return "eu tenho preguiça até para emitir som";
		}
}
