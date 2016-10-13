package test;

public class Fibonacci {
	   public static long fibonacci(long number) {
	      if ((number == 0) || (number == 1))
	         return number;
	      else
	         return fibonacci(number - 1) + fibonacci(number - 2);
	   }
	   public static void main(String[] args) {
		   for(int i = 0 ;i < 1000 ; i++) {
			   System.out.println(fibonacci(i));
		   }
	   }
	}