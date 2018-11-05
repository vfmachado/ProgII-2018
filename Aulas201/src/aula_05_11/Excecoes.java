package aula_05_11;

import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		ContaBancaria conta = new ContaBancaria("Vinicius", 0);
		
		/*
		if (conta.depositar(-100)) {
			System.out.println("Operação bem sucedida");
		} else {
			System.out.println("Operação não executada... "
					+ "não pode depositar valor negativo");
			
		}
		*/
		
		
		try {
			conta.depositar(-100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		
	}

}
