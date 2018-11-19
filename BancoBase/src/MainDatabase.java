import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDatabase {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver do banco não encontrado");
			e.printStackTrace();
			System.exit(-1);
		}
		
		try {
			
			//Connection con = DriverManager.getConnection
			//		("jdbc:postgresql://200.132.13.90:4731/teste", "roger", "roger");
			Connection con = DriverManager.getConnection
					("jdbc:postgresql://10.132.13.29:5432/teste", "roger", "roger");
			System.out.println("Connected with success");
			
			Statement stat = con.createStatement();
			
			//stat.executeUpdate("insert into usuario (nome, login, senha) values ('Cris', 'crisga', '1234')");
			
			ResultSet rs = stat.executeQuery("select * from usuario");
			
			while (rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("login"));
				System.out.println(rs.getString("senha"));
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
