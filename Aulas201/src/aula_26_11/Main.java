package aula_26_11;

import java.util.Scanner;


public class Main {

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
			System.out.println("Verifique a conexão");
		}
		
		final int sair = 5;
		Scanner in = new Scanner(System.in);
		
		int op;
		
		do {
			
			System.out.println("O que você deseja fazer?");
			System.out.println("\t1. Criar / add um usuario");
			System.out.println("\t2. Ver dados cadastrados");
			System.out.println("\t3. Atualizar um cadastro");
			System.out.println("\t4. Deletar cadastro");
			System.out.println("\t5. Sair do programa");
			
			op = in.nextInt();
			
			switch (op) {
			case 1:
				in.nextLine();
				System.out.println("Digite o nome, login e senha");
				String nome = in.nextLine();
				String login = in.next();
				String senha = in.next();
				Usuario novoUsuario = new Usuario(nome, login, senha);
				//inserir no banco
				database.inserePessoa(novoUsuario);
				break;
			case 2:
				database.mostraTodos();
				break;
			case 3:
				in.nextLine();
				System.out.println("Informe o nome que deseja alterar os dados: ");
				String nomeAlt = in.nextLine();
		
				System.out.println("informe o novo login e a nova senha: ");
				String newLogin = in.next();
				String newSenha = in.next();
				
				Usuario user = new Usuario(nomeAlt, newLogin, newSenha);
				database.atualiza(user);		
				break;
			case 4:
				System.out.println("Informe o login que deseja remover: ");
				String loginRemover = in.next();
				database.remover(loginRemover);
				break;
			}
			
			
		} while (op != sair);
		
	}

}
