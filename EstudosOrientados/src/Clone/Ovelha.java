package Clone;

public class Ovelha {

	private String raca;
	
	private String cor;

	public Ovelha() {
		// TODO Auto-generated constructor stub
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public Ovelha clone() {
		Ovelha clone = new Ovelha();
		clone.cor = this.cor;
		clone.raca = this.raca;
		return clone;
	}
}
