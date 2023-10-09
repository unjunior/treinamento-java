package lista1;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		/*10. Escreva uma classe que conte a quantidade de vogais, espaços em
			brancos e consoantes de uma cadeia de caracteres.
		 */
			
			
			Scanner s = new Scanner(System.in);
			System.out.println("Digite um frase");
			String txt = s.nextLine();
			
			int branco = 0;
			
			String[] vetor = txt.split(" ");
			for (int i=1; i < vetor.length; i++) {
				branco+=1;
			}
			System.out.println("espaços = " + branco);
			
			s.close();
			
			int vogal = 0;
			int consoante = 0;
			
			for (int i = 0; i < txt.length(); i++) {
				if ((txt.charAt(i) == 'a') || (txt.charAt(i) == 'e') || (txt.charAt(i) == 'i') || (txt.charAt(i) == 'o') || (txt.charAt(i) == 'u')){
					vogal += 1;
				}
				
			}
			
			consoante = (txt.length() - vogal - branco);
			System.out.println("VOGAL = " + vogal);
			System.out.println("CONSOANTE = " + consoante);
			
				
		}
		
	}
	
	

