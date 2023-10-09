package lista1;

import java.util.Locale;
import java.util.Scanner;

/*
	 * 4. Pretende-se escrever um programa que leia do teclado uma distância
	expressa em milhas, converte-a para quilômetros e apresenta o resultado no
	console. (fórmula de conversão: 1 milha = 1.609 km).
 * */

public class Questao4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor em milhas: ");
		double valorMilhas = s.nextDouble(); 
		
		double valorKm = valorMilhas * 1.609;
		System.out.printf("O valor %.3f milhas é %.3f km", valorMilhas, valorKm);
		s.close();
		
	}

}
