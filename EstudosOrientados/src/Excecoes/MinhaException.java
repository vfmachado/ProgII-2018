package Excecoes;

public class MinhaException extends Exception {

	public MinhaException(String msg) {
		super(msg); //chama o construtor da superclasse (classe que está sendo estendida...)
		//neste caso, extends EXCEPTION
	}
	
}
