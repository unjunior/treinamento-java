package lista1;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		/* 8. Criar uma classe Java que receba uma palavra (String) retorne uma
			mensagem caso a
			palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita
			ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso,
			etc.
		*/
		
		Scanner s = new Scanner(System.in);
		
		//System.out.print("Digite um palavra: ");
		
		System.out.print("Digite uma palavra: ");
		String palavra = s.next();
		String palavra2 = "";
		
		for(int i = palavra.length()-1; i>=0; i --) {
			palavra2 = palavra2 + palavra.charAt(i);
		}
		
		if(palavra.equals(palavra2)){
			System.out.println("É PALINDROMO");
		}
		else {
			System.out.println("NÃO É PALINDROMO");
		}
		
		
	
		s.close();
		

	}

}
