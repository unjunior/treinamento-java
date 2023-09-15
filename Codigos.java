package exercicio0;

import java.util.Scanner;

public class Codigos {

	public static void main(String[] args) {
		/*
		 * 11. Utilize a estrutura if para fazer um programa que retorne o nome de um
			produto a partir do código do mesmo. Considere os seguintes códigos:
			
			001 ? Parafuso;
			002 ? Porca;
			003 ? Prego;
			
			Para qualquer outro código: XXX ? Diversos.

		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o código: ");
		int codigo  = s.nextInt();
		
		if(codigo == 001) {
			System.out.println("PARAFUSO");
		}
		else if(codigo == 002) {
			System.out.println("PORCA");
		}
		else if(codigo == 003) {
			System.out.println("PREGO");
		}
		else {
			System.out.println("DIVERSOS");
		}
		
		
		
		s.close();
		
		
		

	}

}
