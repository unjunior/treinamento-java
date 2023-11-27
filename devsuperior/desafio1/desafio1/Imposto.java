package desafio1;

import java.util.Locale;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Renda anual com salário: ");
		double salarioAnual = scan.nextDouble();
		double impostoSalario;

		if (salarioAnual < 36000.00) {
			impostoSalario = 0.0;
		} else if (salarioAnual <= 60000.00) {
			impostoSalario = salarioAnual * 0.10;
		} else {
			impostoSalario = salarioAnual * 0.20;
		}

		System.out.print("Renda anual com prestação de serviço: ");
		double prestacaoServico = scan.nextDouble();

		double impostoServico = prestacaoServico * 0.15;

		System.out.print("Renda anual com ganho de capital: ");
		double ganhoCapital = scan.nextDouble();

		double impostoCapital = ganhoCapital * 0.2;

		System.out.print("Gastos médicos: ");
		double gastosMedicos = scan.nextDouble();
		System.out.print("Gastos educacionais: ");
		double gastosEducacionais = scan.nextDouble();
		
		double totalImpostoBruto = impostoSalario + impostoServico + impostoCapital;
		double totalMedicoEducacao = gastosMedicos + gastosEducacionais;
		double maximoDedutivel = totalImpostoBruto * 0.3;
		double impostoDevido;
		double abatimento;

		if (maximoDedutivel < totalMedicoEducacao) {
			abatimento = maximoDedutivel;
			impostoDevido = totalImpostoBruto - abatimento;
		} else {
			abatimento = totalMedicoEducacao;
			impostoDevido = totalImpostoBruto - abatimento;
		}
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");

		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);

		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", totalMedicoEducacao);

		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", totalImpostoBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);

		scan.close();
	}

}
