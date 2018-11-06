package aula_05_11;

public class ContaBancaria {

	private String titular;
	
	private float saldo;
	
	private float limite;
	
	private float salario;

	
	public ContaBancaria(String titular, float saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	 
	//O MÉTODO DEPOSITAR PODE JOGAR UMA EXCEÇÃO
	public void depositar(float valor) throws Exception {
		if (valor > 0) {
			saldo += valor;
		} else {
			throw new Exception("Operação inválida");
		}
	}
	
	
	public void sacar(float valor) {
		saldo -= valor;
	}
	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	
}
