package aula_19_11;

public class TesteBanco {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Classe encontrada");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Banco database = new Banco();
		boolean conectou = database.conecta();
		
		if (conectou == true) {
			System.out.println("Show de bola!!!");
		} else {
			System.out.println("Verifique a conex�o");
		}
		/*
		boolean inseriu = database.inserePessoa("Guilherme", "greer", "1234");
		if (inseriu) {
			System.out.println("Usu�rio inserido com sucesso");
		} else {
			System.out.println("Ocorreu algum erro ao inserir o usu�rio");
		}
		*/
		
		database.mostraTodos();
	}

}
