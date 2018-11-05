package aula_29_10.heranca;

public class Panqueca {

	private String massa;
	
	
	public Panqueca() {
		this.massa = "Massa base simples";
	}
	
	
	public String getMassa() {
		return this.massa;
	}

	
	public String getDescricao() {
		return this.massa + " e sem sabor";
	}
}
