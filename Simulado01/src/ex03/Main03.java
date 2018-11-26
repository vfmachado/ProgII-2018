package ex03;

/*
 * DADO O CÓDIGO ABAIXO, DESENVOLVA OS MÉTODOS 
 * NECESSÁRIOS NAS CLASSES QUE ESTÃO NESTE PACOTE.
 * 
 * 
 */

public class Main03 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Arroz", 2.5f);
		Produto p2 = new Produto(2, "Feijao", 3.5f);
		Produto p3 = new Produto(3, "Bolacha", 4.5f);
		Produto p4 = new Produto(3, "Biscoito", 5.5f);
		Produto p5 = new Produto(4, "Coca-cola", 5.5f);
		
		SuperMercado sm1 = new SuperMercado();
		sm1.addProduto(p1);
		sm1.addProduto(p2);
		sm1.addProduto(p3);
		sm1.addProduto(p4);
		
		Compra minhaCompra = new Compra();
		minhaCompra.add(sm.item(1));
		minhaCompra.add(sm.item(3));
		minhaCompra.add(sm.item(3));
		minhaCompra.add(sm.item(3));
		minhaCompra.add(sm.item(5));
		
	}

}
