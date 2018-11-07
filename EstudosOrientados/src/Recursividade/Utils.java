package Recursividade;

public class Utils {

	private final static String NOME = "Classe de utilidades";
	
	public static void text(String s) {
		System.out.println(NOME + " diz:\n\t" + s);
	}
	
	
	public static void main(String[] args) {
		
		Utils.text("Vinicius");
		
		Utils.text("Abc");
		
		Utils.text("" + Utils.fatorial(5));
	}
	
	public static int fatorial(int n) {
		
		if (n == 0) {
			return 1;
		}
		
		return n * fatorial(n-1);
	}
}
