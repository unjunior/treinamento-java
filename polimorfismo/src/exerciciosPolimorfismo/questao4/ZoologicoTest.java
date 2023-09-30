package exerciciosPolimorfismo.questao4;

import java.util.Scanner;

public class ZoologicoTest {

	public static void main(String[] args) {
		
		Zoologico zoo = new Zoologico();
		
		Animal lobo = new Lobo();
		Animal leao = new Leao();
		Animal peixe = new Peixe();
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<zoo.jaula.length; i++) {
			System.out.println("Dados do animal: ");
			System.out.print("Nome: ");
			String nome = s.next();
			System.out.print("Tipo: ");
			String tipo = s.next();
			
			zoo.jaula[i] = new Animal(nome, tipo);
			
			if(tipo.equals("leao")) {
				System.out.println(leao.correr());	
				System.out.println(leao.somDoAnimal());
			}
			if(tipo.equals("lobo")) {
				System.out.println(lobo.correr());	
				System.out.println(lobo.somDoAnimal());
			}
			
			if(tipo.equals("peixe")) {
				System.out.println(peixe.correr());	
				System.out.println(peixe.somDoAnimal());
			}
		}
		
		
		s.close();
		
	}

}
