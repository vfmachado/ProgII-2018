package aula_13_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoArquivos {

	public static void main(String[] args) {
		
		File arquivo = new File("Teste202.txt");
		
		try {
			FileWriter fw = new FileWriter(arquivo);
		
			//fw.write("Vinicius Machado\n27\nEduardo\n17\nRichard\n17\n");
			Contato c = new Contato("Vinicius", "51997999999", 27);
			fw.write(c.toString());
			
			Contato c2 = new Contato("Cris", "53999999999");
			fw.write(c2.toString());
			
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
