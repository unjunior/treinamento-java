package exercicio0;

import java.util.Scanner;

public class MediaDoWhile {

	public static void main(String[] args) {
		/*
		 * 15. Refaça o programa anterior utilizando a estrutura do while.
		*/
		Scanner s = new Scanner(System.in);
		int soma =0; 
		int numero = 0;
		int cont = 1;
		
		do {
			System.out.print("Digite um número: ");
			numero = s.nextInt();
			soma += numero;
			cont += 1;
			
		}while(cont <= 5);
		
		System.out.println(soma);
		s.close();
		
	}

}
