package Ex34;

public class Main {

	public static void main(String[] args) {

		Conta c = new Conta();
		System.out.println(c.getSaldo());
		c.deposita(100);
		System.out.println(c.getSaldo());
		c.setLimite(100);
		System.out.println(c.getSaldo());
		try {
			c.saca(150);
		} catch (ContaExcecao e) {
			System.out.println("Ei... não foi possível sacar...");
			e.printStackTrace();
		}
		System.out.println("Seu saldo atual é: " + c.getSaldo());

	}

}
