package aula_05_11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoArray {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		
		nomes.add("Vinicius");
		nomes.add("Maysa");
		nomes.add("Malu");
		nomes.add("Laura");
		nomes.add("Raio");
		nomes.add("Rebechi");
		
		while (true) {
			try {
				System.out.println("Digite uma posição:");
				int pos = in.nextInt();
				System.out.println(nomes.get(pos));
			} catch (InputMismatchException erroEntrada) {
				System.out.println("Oiii ... tem que digitar um numero!!!");
				in.nextLine(); //problema do java
			} catch (IndexOutOfBoundsException erroTamanho) {
				System.out.println("Tentou acessar uma posição invalida");
				in.nextLine();
			}
		}
		
		
	}

}
