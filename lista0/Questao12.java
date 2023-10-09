package lista1;
import java.util.Scanner;


public class Questao12 {

	

	public static void main(String[] args) {

		 double km = 0;
		 double litros = 0;
		 double consumo = 0;
		 double media = 0;
		 double totalkm = 0;
		 int contador = 1;
		 
		 Scanner s = new Scanner(System.in);

		 while (km != -1) {	 	

		 	System.out.print("Quilômetros rodados ou -1 para sair: ");
		 	km = s.nextDouble();

		 	System.out.print("Consumo de combustível ou -1 para sair:");
		 	litros = s.nextDouble();

		 	if (km > 0) {
		 		System.out.printf("Média do carro %d: %.2f KM/Litro\n", contador++, km / litros);
			}

			totalkm += km;
			consumo += litros;
			media = km / litros;

	
			System.out.println();
			System.out.println(String.format("Total de quilômetros rodados: %.2f", totalkm));
			System.out.println(String.format("Total de combustível gasto: %.2f", consumo));
			System.out.println(String.format("Quilômetros por litro: %.2f", media));		
		
	
		 }
		 s.close();	
	}

}
