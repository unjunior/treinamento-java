package lista1;

import java.util.Scanner;

public class Questao2 {
	// 2. Faça um programa que receba 2 valores e retorne o maior entre eles.
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int numero1 = s.nextInt();
		System.out.print("Digite o segundo numero: ");
		int numero2 = s.nextInt();
		
		if(numero1 > numero2) {
			System.out.printf("%d maior que %d", numero1, numero2);
		}
		else if(numero2 > numero1) {
			System.out.printf("%d maior que %d", numero2, numero1);
		}
		else {
			System.out.printf("%d é igual a %d", numero2, numero1);
		}
		
		s.close();
		
	}
	
	
}
