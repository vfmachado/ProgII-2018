package aula_13_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LendoArquivos {

	public static void main(String[] args) {
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		
		File arquivo = new File("Teste202.txt");
		try {
			Scanner in = new Scanner(arquivo);
			
			while (in.hasNextLine()) {
				
				String nome = in.nextLine();
				String telefone = in.nextLine();
				
				//converte um texto para inteiro
				//int idade = Integer.parseInt(in.nextLine());
				//ou assim...
				int idade = in.nextInt();
				in.nextLine();
				
				Contato c = new Contato(nome, telefone, idade);
				contatos.add(c);
			}
			
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Deu ruim... não tem o arquivo...");
			e.printStackTrace();
		} catch (InputMismatchException erroEntrada) {
			System.out.println("Arquivo corrompido, não foi possível carregar os contatos...");
		}
		
		System.out.println(contatos.toString());
		System.out.println("\n\n");
		
		for (Contato c : contatos) {
			System.out.println("\nNome: " + c.getNome() 
			+ "\nTelefone: " + c.getTelefone() + 
			(c.getIdade() > 0 ? " tem " + c.getIdade() + " anos" : "")
							); //do syso
		}
	}
	
}
