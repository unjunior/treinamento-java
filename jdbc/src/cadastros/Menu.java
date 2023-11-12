package cadastros;

public class Menu {

	public static void main(String[] args) {

		PessoaDao pd = new PessoaDao();
		try {
			Pessoa p1 = new Pessoa(1, "José", "jose@email.com");
			Pessoa p2 = new Pessoa(2, "Maria", "maria@email.com");

			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
