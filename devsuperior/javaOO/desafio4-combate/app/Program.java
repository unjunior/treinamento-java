package app;

import java.util.Scanner;

import combate.Champion;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = scan.nextLine();
		System.out.print("Vida inicial: ");
		int lifeInitial = scan.nextInt();
		System.out.print("Ataque: ");
		int attack = scan.nextInt();
		System.out.print("Armadura: ");
		int armor = scan.nextInt();

		Champion A = new Champion(name, lifeInitial, attack, armor);
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		scan.nextLine();
		System.out.print("Nome: ");
		name = scan.nextLine();
		System.out.print("Vida inicial: ");
		lifeInitial = scan.nextInt();
		System.out.print("Ataque: ");
		attack = scan.nextInt();
		System.out.print("Armadura: ");
		armor = scan.nextInt();

		Champion B = new Champion(name, lifeInitial, attack, armor);
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int round = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i < round; i++) {
			
			A.takeDamage(B);
			B.takeDamage(A);
			System.out.println("Resultado do turno " + (i + 1) + ": ");
			System.out.println(A.status());
			System.out.println(B.status());
			
			if(A.getLife() <=0 || B.getLife() <=0) {
				break;
			}
			System.out.println();
		}
		
		System.out.println("FIM DO COMBATE");

		scan.close();

	}

}
