package Ex04;

public class Main {

	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor();
		
		try {
			fornecedor.setNome("Thiago");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fornecedor.setValorCredito(1000);
		fornecedor.setValorDivida(730);
		
		System.out.println(fornecedor.getNome());
		System.out.println(fornecedor.obterSaldo());
	}

}
