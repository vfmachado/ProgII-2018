package Recursividade;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Deus");
		
		Pessoa a = new Pessoa();
		a.setNome("Adao");
		a.setPai(p);
		//a.setMae(p);
		
		Pessoa b = new Pessoa();
		b.setNome("Eva");
		b.setPai(p);
		//b.setMae(p);
		
		Pessoa c = new Pessoa();
		c.setNome("Larica");
		c.setMae(b);
		c.setPai(a);
		
		Pessoa d = new Pessoa();
		d.setNome("Poc");
		d.setMae(b);
		d.setPai(a);
		
		
		Pessoa e = new Pessoa();
		e.setNome("Pacuman");
		e.setMae(c);
		e.setPai(d);
		
		//e.tipo = "Divindade";
		
		criaArvore(e);
		//System.out.println(e.getDescricao());
	}

	public static void criaArvore(Pessoa p) {
		
		System.out.println(p.getDescricao());
		
		if (p.getPai() != null) {
			criaArvore(p.getPai());
		}
		if (p.getMae() != null) {
			criaArvore(p.getMae());
		}
		
	}
	
}
