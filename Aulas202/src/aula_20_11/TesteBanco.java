package aula_20_11;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("TUDO CERTOOO!!!");
		} catch (ClassNotFoundException ex) {
			System.out.println("Classe não encontrada");
			ex.printStackTrace();
		}
		
		Scanner in = new Scanner(System.in);
		MeuBanco banco = new MeuBanco();
		
		if (banco.conectar()) {
			System.out.println("Conectado com sucesso");
		} else {
			System.out.println("Erro ao conectar");
			System.exit(-1);
		}
		
		boolean saiu = false;
		
		do {
			System.out.println("O que você deseja fazer?");
			System.out.println("\t1. Inserir dado");
			System.out.println("\t2. Ver dados");
			System.out.println("\t3. Sair");
			
			int opcao = in.nextInt();
			in.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o nome, login e senha");
					Usuario a = new Usuario();
					a.setNome(in.nextLine());
					a.setLogin(in.nextLine());
					a.setSenha(in.nextLine());
					
					boolean ok = banco.inserir(a);
					if (ok) {
						System.out.println("Parabens, você conseguiu digitar 3 linhas.");
					} else {
						System.out.println("eita... deu ruim");
					}
					break;
				case 2:
					banco.mostrar();
					break;
				case 3:
					saiu = true;
					break;
				
			}
			
		} while(!saiu);
		
	}

}
