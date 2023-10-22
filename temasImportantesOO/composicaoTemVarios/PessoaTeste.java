package composicaoTemVarios;

public class PessoaTeste {

	public static void main(String[] args) {

		// USANDO VETORES
		
		Pessoa p1 = new Pessoa();
		Endereco end = new Endereco();
		Telefone tel = new Telefone();
		Telefone tel2 = new Telefone();
		
		p1.setNome("João");
		
		//p1.setTelefone("71 98888-0000");
		
		//devemos criar a instancia de endereco
		
		end.setNomeRua("Rua do paraiso");
		end.setNumero("s/n");
		end.setComplemento("-");
		end.setCidade("Salvador");
		end.setEstado("Bahia");
		end.setCep("9999999");
		
		//Pessoa tem um endereco
		p1.setEndereco(end);
		
		tel.setTipo("celular");
		tel.setDdd(71);
		tel.setNumero("99999-2222");
		tel2.setTipo("comercial");
		tel2.setDdd(11);
		tel2.setNumero("55555-1111");
		
		// Pessoa tem VARIOS telefones 
		
		Telefone[] phones = new Telefone[2]; // cria a lista de telefones
		phones[0] = tel; // atribui o primeiro telefone a primeira posição da lista
		phones[1] = tel2; // atribui o segundo telefone a segunda posição da lista
		p1.setTelefones(phones);  // a pessoa p1 tem os dois telefones
		
		
		
		System.out.println(p1.getNome());
		if(p1 != null && p1.getEndereco() != null) {
			System.out.println(p1.getEndereco().getCidade());

		}
		if(p1 != null && p1.getTelefones() != null) {
			for(Telefone t : phones) {
				System.out.println("NUMERO: " + t.getNumero() + " TIPO: " + t.getTipo());
			}
			
		}
		
		
	}

}
