package desafio.app;

import java.util.Locale;
import java.util.Scanner;

import desafio.entities.Address;
import desafio.entities.Departament;
import desafio.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner s = new Scanner(System.in);
		System.out.print("Nome do departamento: ");
		String nomeDept = s.nextLine();
		System.out.print("Dia do pagamento: ");
		Integer diaPagamento = s.nextInt();
		s.nextLine();
		System.out.print("Email: ");
		String email = s.nextLine();
		System.out.print("Telefone: ");
		String telefone = s.nextLine();

		Address address = new Address(email, telefone);

		Departament dept = new Departament(nomeDept, diaPagamento, address);

		System.out.print("Quantos funcionários tem o departamento? ");
		int quant = s.nextInt();

		for (int i = 1; i <= quant; i++) {
			System.out.println("Dados do funcionário " + i + ": ");
			s.nextLine();
			System.out.print("Nome: ");
			String nomeFunc = s.nextLine();
			
			System.out.print("Salario: ");
			Double salario = s.nextDouble();
			Employee emp = new Employee(nomeFunc, salario);
			dept.addEmployee(emp);

		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO:");
		showReport(dept);
		s.close();

	}

	public static void showReport(Departament dept) {

		System.out.printf("Departamento Vendas = R$ %.2f%n", dept.payroll());
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());

		System.out.println("Funcionários: ");
		System.out.println(dept);

		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());
	}

}
