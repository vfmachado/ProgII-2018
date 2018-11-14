package Ex04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args)  {
		
		Pessoa p = new Pessoa();
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Qual o nome da pessoa?");
			p.setNome(in.nextLine());
			//p.setNome("");
		} catch (Exception e) {
			System.out.println("Seu qlqr coisa preenche direito isso aí");
			e.printStackTrace();
		}
		p.setEndereco("Pelotas");
		
		System.out.println(p);
		
	}

}
