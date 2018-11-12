package aula_12_11.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendorArquivo {

	public static void main(String[] args) {
		
		File arquivo = new File("src/teste.txt");
		
		try {
			FileWriter fw = new FileWriter(arquivo);
			
			fw.write("Vinicius Fritzen Machado, 27 anos, professor");
			
			fw.write("\nWeslley Dalsotto, 16 anos, estudante");
			
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
