package testes;

import heranca.Operario;

public class OperarioTeste {

	public static void main(String[] args) {

		Operario operario = new Operario("José da Silva", "71 98511-0000", "Rua das margaridas", 1001, 3000, 10, 500, 20);
		
		System.out.println(operario.calcularSalario());
		

	}

}
