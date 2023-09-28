package testes;

import java.util.Locale;
import java.util.Scanner;

import heranca.Administrador;

public class AdministradorTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Administrador adm = new Administrador("Maria", "9999-9999", "Rua nova", 1234, 2000, 5, 500);
		
		System.out.println(adm);
		s.close();
	}

}
