

public class FizzBuzz {
	
	public static String checkNum(int n) {

		Integer num = n;
		
		if(n == 0) {
			return "0";
		}
		else if(n%3==0 && n%5==0) {
			
			return "FizzBuzz";
		}
		else if(n%3==0) {
			return "Fizz";
		}
		else if(n%5==0) {
			return "Buzz";
		}
		else {
			return num.toString();
		}			
	}	
	
//-------------------------------
	public static void main(String args[]) {
		
	for(int i=1; i<101; i++) {
		System.out.print(checkNum(i)+ " ");	
	}
		
		
	} // main		
		
} 

