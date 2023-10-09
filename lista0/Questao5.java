package lista1;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		/*
		 * 5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
			tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
			Terça corresponde a 2, e assim por diante. Utilizando Array.
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um valor entre 1 e 7: ");
		int n = s.nextInt();
		
		String[] dias = new String[7];
		switch (n) {
		case 1:
			System.out.println(dias[0] = "Domingo");
			break;
		
		case 2:
			System.out.println(dias[1] = "Segunda");
			break;
			
		case 3:
			System.out.println(dias[2] = "Terça");
			break;
			
		case 4:
			System.out.println(dias[3] = "Quarta");
			break;
			
		case 5:
			System.out.println(dias[4] = "Quinta");
			break;
			
		case 6:
			System.out.println(dias[5] = "Sexta");
			break;
			
		case 7:
			System.out.println(dias[6] = "Sabado");
			break;
			
		default:
			System.out.println("Opção inválida. Digite outro valor.");
		}
		
		s.close();

	}

}
