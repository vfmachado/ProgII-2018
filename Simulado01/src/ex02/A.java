package ex02;

/*
 * DADA A CLASSE ABAIXO, DESENVOLVA:
 * 1. SA�DA NO CONSOLE DO PROGRAMA.
 * 2. QUAIS S�O AS CHAMADAS FEITAS AO M�TODO c
 * 		ex: a primeira chamada � c(5, 3) na linha 27
 * 3. EXPLIQUE COM AS SUAS PALAVRAS O M�TODO c
 */

public class A {

	public int i = 0;
	
	public int c(int n, int k) {
		
		if (k == 1) {
			return n;
		} else if (k == n) {
			return 1;
		}
		i++;
		return c(n-1, k-1) + c(n-1, k);
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.c(5, 3));
		System.out.println(a.i);
	}
}
