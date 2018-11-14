package Ex14;

import java.util.ArrayList;

public class Merge {

	public static ArrayList<String> juntaNomes
		(ArrayList<String> nomes1, ArrayList<String> nomes2) {
	
		ArrayList<String> todos = new ArrayList<String>();
		 
		//posição nos vetores
		int v1 = 0;
		int v2 = 0;
		
		while (v1 < nomes1.size() && v2 < nomes2.size()) {
			
			if (nomes1.get(v1).compareTo(nomes2.get(v2)) <= 0 ) {
				todos.add(nomes1.get(v1));
				v1++;
			} else {
				todos.add(nomes2.get(v2));
				v2++;
			}
			
		}
		
		return todos;
	}
	
}
