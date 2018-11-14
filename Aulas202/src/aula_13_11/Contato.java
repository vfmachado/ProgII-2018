package aula_13_11;

public class Contato {

	private String nome;
	
	private String telefone;

	private int idade;
	
	 
	public Contato(String nome) {
		this.nome = nome;
	}
	
	public Contato(String nome, String telefone) {
		this(nome);
		this.telefone = telefone;
	}
	
	public Contato(String nome, String telefone, int idade) {
		this(nome, telefone);
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return this.nome + "\n" + this.telefone + "\n" + this.idade + "\n";
	}
	
}
