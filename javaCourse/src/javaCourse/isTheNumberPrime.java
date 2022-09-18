package javaCourse;

public class isTheNumberPrime {

	public static void main(String[] args) {
		// is the number prime ?
		
				int number =25;
				int reminder =number %2;
				
				System.out.println(reminder);
				
				boolean isPrime =false;
				
				for (int i =2;i<number;i++) {
					if(number %i ==0) {
						isPrime=false;
						
					}
					
				}	
				
				if (isPrime== true) {
					System.out.println("number is prime");
					
					
				}else {
					System.out.println("number is not prime");
				}
				
	}

}
