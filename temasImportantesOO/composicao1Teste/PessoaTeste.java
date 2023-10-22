package composicao1Teste;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		
		p1.nome = "Maria";
		p1.telefone = "44444444";
		
		Endereco e = new Endereco();
		
		p1.endereco = e;
		
		System.out.println(p1.endereco.cidade = "Recife");
		
	}

}
