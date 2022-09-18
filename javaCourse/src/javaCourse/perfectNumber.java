package javaCourse;

public class perfectNumber {

	public static void main(String[] args) {
		// PERFECT NUMBER
		
				int number = 28;
				int total =0;
				
				for(int i =1;i<number;i++) {
					
					if(number %i ==0) {
						total =total+i;
					}
				}
						
				if(total == number) {
					System.out.println("number is perfect number");
					
				}else {
					System.out.println("number is not a Perfect Number");
				}

	}

}
