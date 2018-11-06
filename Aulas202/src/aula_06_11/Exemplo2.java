package aula_06_11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Scanner in = new Scanner(System.in);
		alunos.add(new Aluno(10, "Vinicius"));
		alunos.add(new Aluno(20, "Leo"));
		alunos.add(new Aluno(30, "Richard"));
		alunos.add(new Aluno(40, "Eduarda"));
		alunos.add(new Aluno(50, "Natalia"));
		
		
		while (true) {
			try {
			System.out.println("Informe uma posição do vetor:");
			int pos = in.nextInt();
			
			Aluno selecionado = alunos.get(pos);
			
			Main.printarAluno(selecionado);
			} catch (IndexOutOfBoundsException tche) {
				System.out.println("Erro ao acessar a posição especificada. " + tche.getMessage());
			} catch (InputMismatchException input) {
				System.out.println("Estava esperando um número inteiro e positivo...");
				in.nextLine(); //limpar o que foi digitado anteriormente...
			}
		}
		
		
	}
	
}
