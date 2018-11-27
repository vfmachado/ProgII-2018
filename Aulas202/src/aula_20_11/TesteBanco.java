package aula_20_11;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("TUDO CERTOOO!!!");
		} catch (ClassNotFoundException ex) {
			System.out.println("Classe n�o encontrada");
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
			System.out.println("O que voc� deseja fazer?");
			System.out.println("\t1. Inserir dado");
			System.out.println("\t2. Ver dados");
			System.out.println("\t3. Alterar usuario");
			System.out.println("\t4. Remover usu�rio");
			System.out.println("\t5. Sair");
			
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
						System.out.println("Parabens, voc� conseguiu digitar 3 linhas.");
					} else {
						System.out.println("eita... deu ruim");
					}
					break;
				case 2:
					banco.mostrar();
					break;
				case 3:
					//alterar]
					System.out.println("Digite o nome, novo login e nova senha");
					Usuario atualizado = new Usuario();
					atualizado.setNome(in.nextLine());
					atualizado.setLogin(in.nextLine());
					atualizado.setSenha(in.nextLine());
					banco.update(atualizado);
					break;
				case 4:
					//deletar
					System.out.println("Nome do usu�rio: ");
					String nome = in.nextLine();
					banco.deletar(nome);
					break;
				case 5:
					saiu = true;
					break;
				
			}
			
		} while(!saiu);
		
	}

}
