package fibonacci;

public class Fib {

	
	public int fib(int n) {
	
		if (n == 0 || n == 1) {
			return 1;
		} 

		return fib(n-2) + fib(n-1);	
	}
	
}
