package testes;

import java.util.Scanner;

import heranca.Fornecedor;
import heranca.Pessoa;

public class FornecedorTeste {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o dados da pessoa:");
		System.out.print("Nome: ");
		String nome = s.nextLine();
		
		System.out.print("Telefone: ");
		String telefone = s.nextLine();
		
		System.out.print("Endereço: ");
		String endereco = s.nextLine();
		
		Pessoa p1 = new Pessoa(nome, telefone, endereco);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getTelefone());
		System.out.println(p1.getEndereco());
		
		System.out.println("Dados do fornecedor: ");
		System.out.print("Valor do crédito: ");
		double credito = s.nextDouble();
		System.out.print("Valor do dívida: ");
		double divida = s.nextDouble();
		
		Fornecedor f1 = new Fornecedor(nome, telefone, endereco, credito, divida);
		System.out.println("O saldo do fornecedor é: " + f1.obterSaldo());
		
		
		s.close();
		
		

	}

}
