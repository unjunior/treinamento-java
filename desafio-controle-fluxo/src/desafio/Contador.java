package desafio;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int num1 = s.nextInt();
		System.out.print("Digite o segundo numero: ");
		int num2 = s.nextInt();
		
		try {
			contar(num1, num2);
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			System.out.println("O primeiro número maior que o segundo");
		}
		s.close();
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		int cont = 1;
		if(parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();
		}
		else {
			for(int i = parametroUm+1; i<=parametroDois; i++) {
				System.out.println("Imprimiu o numero " + cont + " vezes");
				cont++;
			}
		}
	
	}
}
