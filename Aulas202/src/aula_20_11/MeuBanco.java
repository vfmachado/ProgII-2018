package aula_20_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MeuBanco {

	private Connection conexao;
	
	public boolean conectar() {
		
		try {
			 conexao = DriverManager.getConnection(
					"jdbc:postgresql://10.132.13.29:5432/teste",
					"roger", "roger");
			 return true;
			//System.out.println("Conectado com sucesso");
		} catch (SQLException e) {
			//System.out.println("Erro ao conectar,"
		//+ " verifique as informações e a conexão com a internet");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean inserir(String nome, String login, String senha) {
		try {
			//INSERINDO O DADO NO BANCO
			//SQL
			String sql = "insert into usuario (nome, login, senha)"
					+ " values "
					+ "('"+nome+"', '"+login+"', '"+senha+"');";
			//A MINHA DECLARACAO
			Statement stat = conexao.createStatement();
			//A EXECUÇÃO - para inserção, remoção e atualização
			stat.executeUpdate(sql);
			//System.out.println("Dado salvo com sucesso!");
			return true;
		} catch (SQLException e) {
			//System.out.println("Erro ao inserir dado no banco");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean inserir(Usuario u) {
		try {
			//INSERINDO O DADO NO BANCO
			//SQL
			String sql = "insert into usuario (nome, login, senha)"
					+ " values "
					+ "('"+u.getNome()+"', '"+u.getLogin()+"', '"+u.getSenha()+"');";
			//A MINHA DECLARACAO
			Statement stat = conexao.createStatement();
			//A EXECUÇÃO - para inserção, remoção e atualização
			stat.executeUpdate(sql);
			//System.out.println("Dado salvo com sucesso!");
			return true;
		} catch (SQLException e) {
			//System.out.println("Erro ao inserir dado no banco");
			e.printStackTrace();
			return false;
		}
	}
	
	public void mostrar() {
		try {
			String sql = "select * from usuario;";
			Statement stat = conexao.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			
			System.out.println("\nNomes cadastrados:");
			while (rs.next()) {
				System.out.println("\t" + rs.getString("nome")
				+ "\t\t" + rs.getString("login"));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao buscar os dados");
			e.printStackTrace();
		}
	}
	
	//BUSCAR PELO NOME / LOGIN / ID
	//BUSCAR TODOS - RETORNA UM ARRAYLIST DO TIPO USUARIO
}
