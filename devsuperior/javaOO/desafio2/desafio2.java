package exercicios.para;

import java.util.Locale;
import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		String nome;
		char sexo;
		double altura, peso;
		double maiorAltura, totalPeso, alturaMulheres;
		maiorAltura = totalPeso = alturaMulheres = 0.0;
		int masculino = 0;
		int feminino = 0;
		String atletaMaisAlto = "";

		System.out.print("Qual a quantidade de atletas? ");
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do atleta numero " + (i + 1) + ": ");
			System.out.print("Nome: ");
			s.nextLine();
			nome = s.nextLine();

			System.out.print("Sexo: ");
			sexo = s.next().charAt(0);

			while ((sexo != 'M') && (sexo != 'F')) {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = s.next().charAt(0);
			}
			if (sexo == 'M') {
				masculino++;
			} else {
				feminino++;
			}

			System.out.print("Altura: ");
			altura = s.nextDouble();

			while (altura <= 0.0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = s.nextDouble();
			}
			if (maiorAltura < altura) {
				maiorAltura = altura;
				atletaMaisAlto = nome;
			}

			if (sexo == 'F') {
				alturaMulheres += altura;
			}

			System.out.print("Peso: ");
			peso = s.nextDouble();

			while (peso <= 0.0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = s.nextDouble();
			}

			totalPeso += peso;
		}

		double media = totalPeso / n;
		double porcentagemHomens = (masculino * 100.0) / n;

		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", media);
		System.out.println("Atleta mais alto: " + atletaMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f%%%n", porcentagemHomens);

		if (feminino == 0) {
			System.out.println("Não há mulheres cadastradas");
		} else {
			double alturaMediaMulheres = alturaMulheres / feminino;
			System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
		}

		s.close();

	}

}
