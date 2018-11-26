package Ex16;

public class Data {

	private int dia;
	
	private int mes;
	
	private int ano;

	
	
	public Data(int dia, int mes, int ano) {
		
		if (dia < 1 || dia > 31) {
			this.dia = 1;
		} else {
			this.dia = dia;
		}
		
		if (mes < 1 || mes > 12) {
			this.mes = 1;
		} else {
			this.mes = mes;
		}
		
		if (ano < 1) {
			this.ano = 1;
		} else {
			this.ano = ano;
		}
		
	}
	
	
	public int compara(Data outra) {
		
		if (this.dia == outra.dia && this.mes == outra.mes && this.ano == outra.ano) {
			return 0;
		} else  if (this.ano > outra.ano) {
			return 1;
		} else if (this.ano == outra.ano) {
			if (this.mes > outra.mes) {
				return 1;
			} else if (this.mes == outra.mes) {
				if (this.dia > outra.dia) {
					return 1;
				} else {
					return -1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}
		
	}
	
	public Data clone() {
		return new Data(this.dia, this.mes, this.ano);
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}
	
	
	
}
