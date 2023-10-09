package lista1;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		/*
		 * 11. Escreva um programa que tenha duas palavras como entrada, e a saída
			imprima as palavras em ordem alfabética (utilize o método compareTo da
			
			classe String),. Informe também, qual das palavras tem o maior número de
			caracteres.
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.print("Primeira palavra: ");
		String palavra1 = s.next();
		System.out.print("Segunda palavra: ");
		String palavra2 = s.next();
		
		int valorComparado = palavra1.compareTo(palavra2);
		
		if(valorComparado < 0) {
			System.out.println(palavra1);
			System.out.println(palavra2);
		}
		else if(valorComparado > 0) {
			System.out.println(palavra2);
			System.out.println(palavra1);
		}
		else {
			System.out.println("Você digitou palavras iguais");
		}
		
		
		if(palavra1.length() > palavra2.length()) {
			System.out.println(palavra1 + " tem maior numero de cacteres" + " TOTAL = " +palavra1.length() + " letras");
		}
		else if(palavra2.length() > palavra1.length()) {
			System.out.println(palavra2 + " tem maior numero de cacteres" + " TOTAL = " +palavra2.length() + " letras");
		}
		
		else {
			System.out.println(" As palavras digitadas tem o mesmo numero de caracteres");
		}
		
		
		s.close();
		
	}

}
