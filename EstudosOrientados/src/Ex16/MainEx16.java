package Ex16;

public class MainEx16 {

	public static void main(String[] args) {
		
		Data data1 = new Data(14, 06, 1991);
		Data data2 = data1;
		
		//data1.addDia(30);
		
		
		System.out.println(data2.getDia());
	}

}
