package testes;
import heranca.Vendedor;

public class VendedorTeste {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("José Alencar", "81 98888-1104", "Rua das flores", 1001, 2000, 10, 5000, 10);
		System.out.println(vendedor.calcularSalario());
	}

}
