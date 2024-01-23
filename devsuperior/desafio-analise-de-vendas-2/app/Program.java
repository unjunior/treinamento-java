package desafio2.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import desafio1.entities.Sale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner s = new Scanner(System.in);
		System.out.print("Entre o caminho do arquivo: ");
		String path = s.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Sale> list = new ArrayList<>();
			
			String linha = br.readLine();
			while (linha != null) {
				String[] campo = linha.split(",");

				list.add(new Sale(Integer.parseInt(campo[0]), Integer.parseInt(campo[1]), campo[2],
						Integer.parseInt(campo[3]), Double.parseDouble(campo[4])));
				
				linha = br.readLine();
			}
			
			System.out.println("Total de vendas por vendedor:");
			
			
			List<Sale> vendedores = list.stream()
					.filter(x -> x.getSeller().length() > 0)
					.collect(Collectors.toList());
			
			   Map<String, Double> somasVendas = vendedores.stream()
		                .collect(Collectors.groupingBy(
		                        p -> p.getSeller(),
		                        Collectors.summingDouble(p -> p.getTotal())
		                ));
			   
			   somasVendas.forEach((seller, total) -> {
		            System.out.println(seller + " - " + String.format("%.2f", total));
		        });
			
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		s.close();
		
	}

}
