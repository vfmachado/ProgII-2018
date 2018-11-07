package Recursividade;

public class Pessoa {

	public static String tipo = "HUMANO";
	
	private String nome;
	
	private Pessoa mae;
	
	private Pessoa pai;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getMae() {
		return mae;
	}

	public void setMae(Pessoa mae) {
		this.mae = mae;
	}

	public Pessoa getPai() {
		return pai;
	}

	public void setPai(Pessoa pai) {
		this.pai = pai;
	}
	
	public String getDescricao() {
		
		String retorno = this.nome + " é " + this.tipo;
		
		if (pai != null) {
			retorno += "\n\t" + this.pai.nome;
		}
		if (mae != null) {
			retorno += "\n\t" + this.mae.nome;
		}		
				
				
		return retorno;
	}
	
	
}
