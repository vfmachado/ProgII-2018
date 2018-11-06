package aula_06_11;

public class Main {

	public static void printarAluno(Aluno a) {
		System.out.print("Matricula: " + a.getMatricula());
		System.out.println("\t\tNome: " + a.getNome());
	}
	
	public static void main(String[] args) {
		
		Aluno leo = new Aluno(8050276, "Leonardo");
		
		Aluno naosei = new Aluno();
		
		/*
		if (naosei.setMatricula(-1234) == true) {
			System.out.println("Matricula aceita");
		} else {
			System.out.println("Valor não é válido");
		}
		*/
		
		try {
			naosei.setMatricula(-123);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		naosei.setNome("Vinicius");
		
		printarAluno(naosei);
	}

}
