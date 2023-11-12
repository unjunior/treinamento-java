package cadastros;

// classe que usa as implementações do projeto 
// camada de persistencia de dados com a classe pessoa

public class PessoaDao extends Dao {

	public void incluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa values(?,?,?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());

		stmt.execute();
		stmt.close();
		close();
	}

	public void alterarPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("update pessoa nome = ?, email = ? where idPessoa = ?");
		stmt.setString(1, p.getNomePessoa());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getIdPessoa());

		stmt.execute();
		stmt.close();
		close();
	}

	public void excluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("delete from pessoa where idPessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}

}
