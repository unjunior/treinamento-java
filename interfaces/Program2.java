package interfaces;

import java.util.Scanner;

import interfaces.classesAbstratas.AnimalAB;
import interfaces.classesComuns.Cachorro;
import interfaces.classesComuns.Elefante;
import interfaces.classesComuns.Gato;
import interfaces.classesComuns.Leao;
import interfaces.classesComuns.Peixe;
import interfaces.classesComuns.Pombo;

public class Program2 {

	public static void main(String[] args) {
		
		AnimalAB animal = null;
			
		Scanner s = new Scanner(System.in);
		System.out.print("Quantidade de comida pelo animal: ");
		float quantidadeComida = s.nextFloat();
		
		System.out.print("Quanto o animal correu? ");
		float quantidadePercorrida = s.nextFloat();
			
		System.out.print("Quantas horas o animal dormiu? ");
		int horasDeSono = s.nextInt();
		s.nextLine();
		System.out.print("Digite o tipo do animal: ");
		String escolhaAnimal = s.nextLine();
		
		if(escolhaAnimal.equalsIgnoreCase("leao")) {
			animal = new Leao(quantidadeComida, quantidadePercorrida, horasDeSono);
		}
		else if(escolhaAnimal.equalsIgnoreCase("cachorro")) {
			animal = new Cachorro(quantidadeComida, quantidadePercorrida, horasDeSono);
		}
			
		else if(escolhaAnimal.equalsIgnoreCase("gato")) {
			animal = new Gato(quantidadeComida, quantidadePercorrida, horasDeSono);
		}
		else if(escolhaAnimal.equalsIgnoreCase("elefante")) {
			animal = new Elefante(quantidadeComida, quantidadePercorrida, horasDeSono);
		}
			
		else if(escolhaAnimal.equalsIgnoreCase("pombo")) {
			System.out.print("Digite a cor do pombo: ");
			String cor = s.nextLine();
			animal = new Pombo(quantidadeComida, quantidadePercorrida, horasDeSono, cor);
		}
		
		else if(escolhaAnimal.equalsIgnoreCase("peixe")) {
			animal = new Peixe(quantidadeComida, quantidadePercorrida, horasDeSono);
			
		}
		
		animal.comer();
		animal.mover();
		animal.dormir();
		
		
		
		
		
			
		
		
		
			
		s.close();
	}

}
