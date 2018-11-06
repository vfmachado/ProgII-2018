package aula_06_11;

public class Aluno {

	private int matricula;
	
	private String nome;

	public Aluno() {
	}
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) throws Exception {
		if (matricula < 0) {
			//fa�o alguma coisa...
			//System.out.println("N�o pode...");
			//return false;
			throw new Exception("Matricula inv�lida");
		} else {
			this.matricula = matricula;
			//return true;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
