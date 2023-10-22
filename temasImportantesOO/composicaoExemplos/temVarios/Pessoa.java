package xti.temVarios;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	public String nome;
	public int idade;
	public List<Carro> carros;
	
	
	public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		carros = new ArrayList<Carro>();
	}

	public String toString() {
		return "Nome: " + nome + ", Idade: " + idade;
				
	}
	
}
