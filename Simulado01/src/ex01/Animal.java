package ex01;

public abstract class Animal {

	protected String nome;
	
	protected String especie;
	
	public Animal(String especie) {
		this.especie = especie;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract String movimentar();
	
	
}
