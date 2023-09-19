package lista1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		//3. Crie uma classe e na função main() implemente um programa que lê um
		//número inteiro do teclado e imprime todos os números primos menores que ele
		//(divisíveis por 1 ou por ele mesmo).
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um numero ");
        int num = s.nextInt();       
        for(int i = 2; i <= num; i++) {
            boolean primo = true;        
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }
		
        s.close();

	}

}
