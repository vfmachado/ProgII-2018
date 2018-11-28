package ex03;

import java.util.ArrayList;
import java.util.List;

public class SuperMercado {

	private List<Produto> produtosDisponiveis;
	
	public SuperMercado() {
		produtosDisponiveis = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto p) throws Exception {
		
		//for (int i = 0; i < produtosDiponiveis.size(); i++) { Produto a = produtosDisponiveis.get(i);
		for (Produto a : produtosDisponiveis) {
			if (a.getCodigo() == p.getCodigo()) {
				throw new Exception("Já existe este código cadastrado");
			}
		}
		
		produtosDisponiveis.add(p);
	}
	
	public Produto item(int cod) {
		
	}
	

}
