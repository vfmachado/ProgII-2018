package aula_29_10.heranca;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		Panqueca panqueca = new Panqueca();
		System.out.println(panqueca.getDescricao());
		
		PanquecaChocolate choco = new PanquecaChocolate();
		System.out.println(choco.getDescricao());
		
	}
	
}
