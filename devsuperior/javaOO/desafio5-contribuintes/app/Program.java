package desafio.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import desafio.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = scan.nextInt();
		System.out.println();
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite os dados do %do contribuinte:%n", i+1);
			System.out.print("Renda anual com salário: ");
			double rendaAnual = scan.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double prestacaoAnual = scan.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capital = scan.nextDouble();
			System.out.print("Gastos médicos: ");
			double ganhosMedicos = scan.nextDouble();
			System.out.print("Gastos educacionais: ");
			double ganhosEducacionais = scan.nextDouble();
			
			TaxPayer taxPayer = new TaxPayer(rendaAnual, prestacaoAnual, capital, ganhosMedicos, ganhosEducacionais);
			
			list.add(taxPayer);
			System.out.println();
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.printf("Resumo do %do contribuinte: %n", i+1);
			System.out.println(list.get(i));
			System.out.println();
		}
		scan.close();

	}

}
