package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		//add adiciona no final do array
		nomes.add("Vinicius");
		
		//verificar o tamanho do vetor
		int tamanho = nomes.size();
		
		//get(posicao) para acessar algum valor
		String valorNaPosicao0 = nomes.get(0);
		
		nomes.add("Douglas");
		nomes.add("Adrian");
		nomes.add("Vitoria");
		nomes.add("Moizes");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome na pos " + i + " é " + nomes.get(i));
		}
		
		Scanner in = new Scanner(System.in);
		String nome = in.next();
		
		int i;
		boolean encontrei = false;
		for (i = 0; i < nomes.size(); i++) {
			System.out.println(i);
			if (nomes.get(i).equals(nome)) {
				System.out.println("Nome está na pos " + i);
				encontrei = true;
				break;
			}
		}
		//if (i == nomes.size()) {
		if (!encontrei) {
			System.out.println("Nome não encontrado");
		}
		
		
		System.out.println("\n\nMostrando com for melhorado...");
		
		//tipo nome_que_vou_usar_no_for : vetor_que_vou_passar
		for (String s : nomes) {
			s = "Alun@ " + s;
			System.out.println(s);
		}
	}
	
}
