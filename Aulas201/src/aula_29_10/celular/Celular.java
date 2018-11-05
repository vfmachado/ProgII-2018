package aula_29_10.celular;

public class Celular {

	private float tamanhoTela;
	private int memoriaInterna;
	private int resolucaoCamera;
	private String sistemaOperacional;
	private String marca;
	
	//neste método devemos setar / colocar / dizer qual o estado inicial do meu objeto
	public Celular() {
	
	}
	
	public Celular(String marca) {
		
		this.marca = marca;
		
		if (marca.equals("Motorola")) {
			this.sistemaOperacional = "Android";
		} else if (marca.equals("Apple")) {
			this.sistemaOperacional = "IOS";
		}
		
	}
	
	public void setTamanhoTela(float t) {

		if (t <= 0) {
			System.out.println("Sua tela é impossível!!!\nInsira novamente");
		} else {
			this.tamanhoTela = t;
		}
	}
	
	public float getTamanhoTela() {
		return this.tamanhoTela;
	}

	public int getMemoriaInterna() {
		return this.memoriaInterna;
	}

	public void setMemoriaInterna(int memoriaInterna) {
		this.memoriaInterna = memoriaInterna;
	}

	public int getResolucaoCamera() {
		return this.resolucaoCamera;
	}

	public void setResolucaoCamera(int resolucaoCamera) {
		this.resolucaoCamera = resolucaoCamera;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
