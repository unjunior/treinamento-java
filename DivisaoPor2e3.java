package exercicio0;

public class DivisaoPor2e3 {

	public static void main(String[] args) {
		/*
		 * 12. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, 
		 * usando os tipos de dados int e double .
		*/
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println((double)i / 2);
			}
		}

	}

}
