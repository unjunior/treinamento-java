package exercicio0;

import java.util.Scanner;

public class MediaWhile {

	public static void main(String[] args) {
		/*
		 * 14. Faça um programa que utilize a estrutura while para ler 50 números 
		 * e calcule e exiba a média aritmética deles. 
		 * (Pesquise sobre como realizar entrada de dados)
		 * */
		
		Scanner s = new Scanner(System.in);
		int cont = 1;
		int soma = 0;
		int numero = 0;
		while(cont <= 50) {
			System.out.print("Digite um número: ");
			numero = s.nextInt();
			soma += numero;
			cont += 1;
		}
		
		System.out.println(soma);
		s.close();
;	}

}
