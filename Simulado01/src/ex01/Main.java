package ex01;

/*
 * DESENVOLVER AS CLASSES URSO E PEIXE CONSIDERANDO
 * O CÓDIGO DESCRITO ABAIXO E TODAS AS CLASSES CONTIDAS
 * NESTE MESMO PACOTE.
 * 
 * QUAL O RESULTADO MOSTRADO NO CONSOLE AO TÉRMINO 
 * DA EXECUÇÃO DESTE PROGRAMA?
 */

public class Main {

	public static void main(String[] args) {
		
		Predador urso = new Urso();
		urso.setNome("Polar");
		
		Presa peixe = new Peixe();
		String res = urso.alimentar(peixe);
		
		System.out.println(res);
		System.out.println("Predador: " + urso);
		System.out.println("Presa: " + peixe);
	}

}
