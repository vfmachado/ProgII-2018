package Ex34;

public class Conta {

	private float saldo;
	
	private float limite;
	
	
	public void deposita(float valor) {
		this.saldo += valor;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public void saca(float valor) throws ContaExcecao {
		//n�o sei como sacar ainda...
		if (valor > this.saldo + this.limite) {
			//d� erro..
			throw new ContaExcecao("Saldo e limite n�o permitem essa opera��o");
		} else {	
			this.saldo -= valor;
		}
	}
	
	public float getSaldo() {
		return this.saldo;
	}
}
