package desafio1.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import desafio1.entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		System.out.print("Entre o caminho do arquivo: ");
		String path = s.nextLine();
		//System.out.println();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Sale> list = new ArrayList<>();
			String linha = br.readLine();

			while (linha != null) {
				String[] campo = linha.split(",");

				list.add(new Sale(Integer.parseInt(campo[0]), Integer.parseInt(campo[1]), campo[2],
						Integer.parseInt(campo[3]), Double.parseDouble(campo[4])));
				linha = br.readLine();
			}
			System.out.println("Cinco primeiras vendas de 2016 de maior preço médio");
			
			List<Sale> novaLista = list.stream()
				.filter(x -> x.getYear() == 2016)
				.sorted((s1,s2) -> s2.averagePrice().compareTo(s1.averagePrice()))
				.limit(5)
				.collect(Collectors.toList());	
			
			for(Sale sale : novaLista) {
				System.out.println(sale);
			}
			
			System.out.println();
			
			double total = list.stream()
					.filter(y -> y.getMonth() == 1 || y.getMonth() == 7)
					.filter(y -> y.getSeller().equals("Logan"))
					.map(y -> y.getTotal())
					.reduce(0.0, (x, y) -> x + y);
			System.out.print("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = " + String.format("%.2f", total));
		}
		
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		s.close();
	}

}
