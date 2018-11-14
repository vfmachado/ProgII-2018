package Ex14;

import java.util.ArrayList;

public class MainEx14 {

	public static void main(String[] args) {
		
		ArrayList<String> n1 = new ArrayList<String>();
		ArrayList<String> n2 = new ArrayList<String>();
		ArrayList<String> todos = new ArrayList<String>();
		
		n1.add("Adrian");
		n1.add("Gabriel");
		n1.add("Natalia");
		
		n2.add("Gabi");
		n2.add("Maysa");
		n2.add("Moizes");
		
		todos = Merge.juntaNomes(n1, n2);
		System.out.println(todos);
	}

}
