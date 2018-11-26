package ex01;

public abstract class Predador extends Animal {

	public Predador(String especie) {
		super(especie);
	}

	public String alimentar(Presa animal) {
		String result = "Eu sou " + this.nome + " e me alimentei de um " + animal.especie;
		animal = null;
		return result;
	}
	
}
