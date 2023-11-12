package cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Classe DAO - classe que fará a conexão com o banco de dados
 */

public class Dao {

	Connection con; // conexão com o banco
	PreparedStatement stmt; // acessa a tabela (insert, update, delete, select)
	ResultSet rs; // consultas na tabela (select da tabela)
	CallableStatement call; // procedures e function

	public void open() throws Exception {
		String url = "jdbc:postgresql://localhost:5432/cadastros";
		String user = "postgres";
		String password = "junior";

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao conectar o banco de dados!");
		}
	}
	
	public void close() throws Exception{
		con.close();
	}

}
