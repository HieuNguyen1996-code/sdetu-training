package basic;

public class HelloWorld {
	public static void main (String[] args) {
		int[] number = {7,1,4,9,10,};
		System.out.println(fib(2));
		System.out.println(factorial(6));
		System.out.println(sum(5));
		System.out.println(Average(number));
		System.out.println(Max(number));
		System.out.println(Min(number));
	}
	public static int fib (int number) {
		if(number == 0 ) {
			return 0;
			
		} else if (number == 1) {
			return 1; 
		
		} else 
			return (fib(number-1) + fib(number-2));
	}
	
	public static int factorial(int number) {
		if(number == 0 || number == 1) {
			return 1;
		}else return( number * factorial(number -1 ));
	}
	
	public static int sum(int number) {
		int temp = 0; 
		for(int i = 0; i <= number; i++) {
			temp = temp + i;
		}
		return temp;
	}
	
	public static int Max(int[] number) {
		int temp = number[0]; 
		for(int i = 1; i < number.length; i++ ) {
			if(temp < number[i]) {
				temp = number[i];
			}
		}
		
		return temp;
	}
	public static int Min(int[] number) {
		int temp = number[0]; 
		for(int i = 1; i < number.length; i++ ) {
			if(temp > number[i]) {
				temp = number[i];
			}
		}
		return temp;
	}
	public static int Average(int[] number) {
		int sum = 0;
		int average = 0;
		for(int i = 0; i < number.length; i++ ) {
			sum = sum + number[i];
		}
		average = sum/number.length;
		return average;
	}
	

}
