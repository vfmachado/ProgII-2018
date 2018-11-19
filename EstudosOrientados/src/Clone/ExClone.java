package Clone;

public class ExClone {

	public static void main(String[] args) {
		
		Ovelha a = new Ovelha();
		a.setRaca("A");
		a.setCor("B");
		
		Ovelha b = a.clone();
		b.setCor("C");
		
		System.out.println(a.getRaca());
		System.out.println(a.getCor());
		
	}

}
