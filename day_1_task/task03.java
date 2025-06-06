package addon_dsa;

public class task03 {
	 public static int factorial(int n) {
	        if (n == 0 || n == 1)
	            return 1;
	        return n * factorial(n - 1);
	    }

	  
	    public static int fibonacci(int n) {
	        if (n == 0)
	            return 0;
	        if (n == 1)
	            return 1;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	       
	        int factNum = 5;
	        System.out.println("Factorial of " + factNum + " is: " + factorial(factNum));

	        
	        int fibTerms = 10;
	        System.out.println("Fibonacci Series up to " + fibTerms + " terms:");
	        for (int i = 0; i < fibTerms; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }
	}


