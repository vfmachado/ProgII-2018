package Ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		String nome;
		float salario;
		
		do {
			System.out.println("Digite o nome: (fim para sair)");
			nome = in.next();
			
			if (nome.equals("fim")) {
				break;
			}
			
			System.out.println("Salário");
			salario = in.nextFloat();
			
			Funcionario f = new Funcionario(nome, salario);
			funcionarios.add(f);
			
		} while (!nome.equals("fim"));
	
		//dar os aumentos
		for (int i = 0; i < funcionarios.size(); i++) {
			
			Funcionario f = funcionarios.get(i);
			
			System.out.println(f.getNome() + "\t" + f.getSalario());
			
			if (f.getSalario() < 150) {
				System.out.println("Novo salário: " + f.getSalario()*1.25f);
			}
			
		}
	}

}
