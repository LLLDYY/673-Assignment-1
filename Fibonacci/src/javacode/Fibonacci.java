package javacode;

public class Fibonacci {
	public static int Fibonacci(long n) {
		if(n == 0)
			return 1;
		else if(n == 1)
			return 1;
		else
			return Fibonacci(n -1) + Fibonacci(n - 2);
		}
	
	public static void main(String[] args) {
		
		for(long i = 0; i <= 98; i++) {
			System.out.println(Fibonacci(i) + " ");

	}

}
}
