package exercicio0;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		//Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = s.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Numero par");
		}
		
		else {
			System.out.println("Número impar");
		}
		s.close();

	}
}
