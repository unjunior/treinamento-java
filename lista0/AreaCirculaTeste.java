package lista1;

import java.util.Scanner;

public class AreaCirculaTeste {

	public static void main(String[] args) {
		
		AreaCirculo area = new AreaCirculo();
		
		System.out.println("Digite o raio");
		Scanner s = new Scanner(System.in);
		area.raio = s.nextDouble();
		
		double total = Math.round(area.CalcularArea());
		System.out.printf("Area = %.3f", total);
		
		s.close();

	}

}
