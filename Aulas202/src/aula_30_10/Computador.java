package aula_30_10;

public class Computador {

	private String processador;
	private int memoriaRam;
	private int armazenamento;
	private int memoriaMax;
	
	public Computador() {
		
		memoriaMax = 16;
		
	}
	
	
	public Computador(String processador, int memoria, int armazenamento) {
		//chama o construtor sem parametros
		this();
		
		this.processador = processador;
		this.memoriaRam = memoria;
		this.armazenamento = armazenamento;
	}
	
	
	public static Computador pcLenovo() {
		Computador computador = new Computador();
		computador.setProcessador("Core i5");
		computador.setMemoriaRam(8);
		computador.setArmazenamento(1024);
		return computador;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public int getMemoriaRam() {
		return memoriaRam;
	}
	
	
	public void setMemoriaRam(int memoriaRam) {
		if (memoriaRam <= 0 && memoriaRam <= memoriaMax) {
			System.out.println("Não vou colocar este dado pois está incorreto");
		} else {
			this.memoriaRam = memoriaRam;
		}
	}
	
	public int getArmazenamento() {
		return armazenamento;
	}
	
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	
}
