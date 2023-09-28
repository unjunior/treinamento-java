package testes;

import java.util.Locale;
import java.util.Scanner;

import heranca.Empregado;
import heranca.Pessoa;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Dados do empregado:");
		System.out.print("Nome: ");
		String nome = s.nextLine();
		System.out.print("Telefone: ");
		String telefone = s.nextLine();
		System.out.print("Endereco: ");
		String endereco = s.nextLine();
		System.out.print("Codigo: ");
		int codigoSetor = s.nextInt();
		System.out.print("Salario base: ");
		double salarioBase = s.nextDouble();
		System.out.print("Imposto: ");
		double imposto = s.nextDouble();
		
		Pessoa empregado = new Empregado(nome, telefone, endereco, codigoSetor, salarioBase, imposto);
		
		System.out.println(empregado);
		
		
		s.close();
		

	}

}
