package aula_06_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite seu nome e sua idade: ");
		String nome = in.nextLine();
		
		int idade;
		
		do {
			try {
				idade = in.nextInt();
				
				if (idade < 0) {
					System.out.println("Digite novamente...");
					continue;
				}
				
				break;
			} catch (InputMismatchException e) {
//				System.out.println("Eii... você não sabe o que é um número?"
//						+ " Acho que deve ser menor de idade... coloquei 10 anos para vc");
//				idade = 10;
				System.out.println("Valor invalido, informe novamente...");
				in.nextLine(); //problema interno do java... por causa do scanner e acha que pq dei enter, digitei alguma coisa...
			}
		} while (true);
		
		System.out.println("Bem vindo " + nome +
				", nem parece ter " + idade + " anos.");
	}
}
