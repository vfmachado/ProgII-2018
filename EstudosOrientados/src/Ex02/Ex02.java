package Ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		float valorEmprestimo;
		float valorPrestacao;
		float taxaJuros;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Valor total do empréstimo, valor pago por mes e taxa de juros");
		valorEmprestimo = in.nextFloat();
		valorPrestacao = in.nextFloat();
		taxaJuros = in.nextFloat();
		int t = 1;
		
		while (valorEmprestimo > 0) {
			
			//valorEmprestimo = valorEmprestimo * (1 + taxaJuros);
			//É O MESMO QUE:
			float valorJuros = valorEmprestimo * taxaJuros;
			valorEmprestimo = valorEmprestimo + valorJuros;
			
			System.out.println("\nMês " + t);
			valorEmprestimo = valorEmprestimo - valorPrestacao;
			t++;
			
			System.out.println("Valor devido: " + valorEmprestimo);
			
		}
		
		
	}

}
