package temasBasicos.getSet;

public class Escola {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		
		a1.setNome("João da Silva Sauro");
		String nome = a1.getNome();
		System.out.println(nome);
		
		a1.setIdade(-15);
		int idade = a1.getIdade();
		
		System.out.println(idade);
	}

}
