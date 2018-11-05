package aula_30_10;

public class Main {

	public static void main(String args[]) {
		
		//m�todo est�tico na classe computador que retorna um computador;
		Computador lenovo = Computador.pcLenovo();
		
		//criando computador com o construtor padr�o
		Computador pcNormal = new Computador();
		
		pcNormal.setProcessador("Core i3 7300");
		
		System.out.println("PC com processador " + pcNormal.getProcessador());
		
		
		ComputadorGamer gamer = new ComputadorGamer();
		gamer.setArmazenamento(2048);
		gamer.setPlacaVideo("GTX 1080TI");
	}
	
}
