package Ex10;

public class Conversor {

	public static String toBinary(int valor) {
		
		int resto;
		String binario = "";
		
		do {
			
			resto = valor % 2;
			valor = valor/2;
		
			binario = resto + binario;
			//System.out.println(binario);
			
		} while (valor > 0);
		
		return binario;
	}
	
	
	public static String toBinary(String valor) {
	
		return toBinary(Integer.parseInt(valor));
		
	}
	
}
