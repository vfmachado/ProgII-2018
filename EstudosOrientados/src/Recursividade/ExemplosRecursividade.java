package Recursividade;

public class ExemplosRecursividade {

	public static void main(String[] args) {
		System.out.println(somaN(3));
	}
	
	public static int somaN(int valor) {
		
		if (valor == 0) {
			return 0;
		}
		return valor + somaN(valor -1);
	}
	
	
	
	
}
