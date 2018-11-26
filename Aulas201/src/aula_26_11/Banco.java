package aula_26_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Banco {

	private Connection conexao;
	
	public boolean conecta() {
		
		try {
			conexao = 
				DriverManager.getConnection(
				//servidor e banco
				"jdbc:postgresql://10.132.13.29/teste", //mudar aqui para o banco de voces
				"roger", "roger"); //login e senha
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean inserePessoa
		(String nome, String login, String senha) {
		
		String sql = "insert into usuario (nome, login, senha) "
				+ " values ('" + nome + "', '" + login + "', '" + senha + "');";
					//values ('guilherme', 'gfmachado', '1234');
		
		try {
			//executar um insert / update / delete
			Statement stat = conexao.createStatement();
			stat.executeUpdate(sql);
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean inserePessoa
	(Usuario user) {
	
	String sql = "insert into usuario (nome, login, senha) "
			+ " values ('" + user.getNome() + "', '" + user.getLogin() + "', '" + user.getSenha() + "');";
				//values ('guilherme', 'gfmachado', '1234');
	
	try {
		//executar um insert / update / delete
		Statement stat = conexao.createStatement();
		stat.executeUpdate(sql);
		return true;
		
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	}
}
	
	public void mostraTodos() {
		
		String sql = "select * from usuario;";
		
		try {
			Statement stat = conexao.createStatement();
			
			//para selects... vamos utilizar o executeQuery
			ResultSet resultado = stat.executeQuery(sql);
			
			//resultado é o nome do ResultSet que foi retornado
			//pela minha consulta.
			//o método next() verifica se há um próximo item  na consulta
			while (resultado.next()) {
				System.out.println(resultado.getString("nome") + "\t" 
								+ resultado.getString("login")
								+ "\t" + resultado.getString("senha"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void remover(String login) {
		
		
		String sql = "delete from usuario where login = '"+login+"';";
		Statement stat;
		try {
			stat = conexao.createStatement();
			stat.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	
	public void atualiza(Usuario u) {
		
		//update nomeTabela SET colunas de vocês... WHERE condição importante
		//normalmente utilizamos a chave primária na condição
		String sql = "UPDATE usuario "
		+ "SET login = '"+u.getLogin()+"', "
		+ "senha = '"+u.getSenha()+"' "
		+ " WHERE nome = '"+u.getNome()+"';";
		
	
		try {
		//declaração, significa que vou executar um sql a partir da minha conexão com o banco.
			Statement stat = conexao.createStatement();
			//esta linha executa de fato!
			stat.executeUpdate(sql);
		} catch (SQLException e) {
			// caso aconteça um erro..
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
