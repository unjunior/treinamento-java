package temasBasicos.getSet;

public class Aluno {

	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Não existe idade negativa");
		}
		else {
			this.idade = idade;
		}
	}
	
	
}
