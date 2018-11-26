package Excecoes;

public class MinhaClasse {

	private String nome;
	
	public void setNome(String nome) throws MinhaException {
		
		if (nome.equals("")) {
			throw new MinhaException("Nome invalido...");
		} else {
			this.nome = nome;
		}
		
	}
	
}
