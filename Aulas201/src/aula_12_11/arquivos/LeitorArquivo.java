package aula_12_11.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeitorArquivo {

	public static void main(String[] args) {
		//testem com arquivos em locais diferentes
		
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		try {
			Scanner in = new Scanner(new File("src/arquivo.txt"));
			
			while (in.hasNextLine()) {
				String nome = in.nextLine();
				int idade = Integer.parseInt(in.nextLine());
				
				Aluno a = new Aluno();
				a.setNome(nome);
				a.setIdade(idade);
				
				listaAlunos.add(a);
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Deu ruim... Não abriu o arquivo");
			e.printStackTrace();
		}
		
		System.out.println("Lista de alunos lidos do arquivo:");
		for (Aluno a : listaAlunos) {
			System.out.println("Nome: " + a.getNome() + 
					"\t\t Idade: " + a.getIdade());
		}
	}

}
