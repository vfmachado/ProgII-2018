package aula_29_10.celular;

public class Main {

	public static void main(String[] args) {

		Celular cel1 = new Celular();
		Celular cel2 = new Celular("Motorola");
		
		Celular cel = cel2;
		
		cel2.setMemoriaInterna(123);
		cel2.setTamanhoTela(-1);
		
		System.out.println(cel.getMarca());
		System.out.println(cel.getSistemaOperacional());
		System.out.println(cel.getTamanhoTela());
		System.out.println(cel2.getMemoriaInterna());
		
	}

}
