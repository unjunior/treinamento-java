package exercicio0;

import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		/*
		 * Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
			que a variável A passe a possuir o valor da variável B e que a variável B 
			passe a possuir o valor da variável A. Apresentar os valores trocados.
		 **/
		Scanner s = new Scanner(System.in);
		System.out.println("Escrevendo os valores de A e B");
		int A = s.nextInt();
		int B = s.nextInt();
		int aux;
		
		System.out.println("variavel A = " + A);
		System.out.println("variavel B = " + B);
		System.out.println("********************************");
		
		System.out.println("Trocando os valores");
		
		aux = B;
		B = A;
		A = aux;
		
		System.out.println("");
		s.close();
		System.out.println("variavel A = " + A);
		System.out.println("variavel B = " + B);
		
		

	}

}
