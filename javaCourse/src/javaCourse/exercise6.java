// METHODS

package javaCourse;

public class exercise6 {

	public static void main(String[] args) {
		
		
		perfectNum();	

	}
	
	
	public static void perfectNum() {
		
		int number = 28;
		int total =0;
		
		for(int i =1;i<number;i++) {
			
			if(number %i ==0) {
				total =total+i;
			}
		}
				
		if(total == number) {
			mesaj("Number  is a Perfect Number :  "+number);
			
		}else {
			System.out.println("number is not a Perfect Number");
		}	
		
	}
	
	
	public static void mesaj(String mesaj) {
		
		System.out.println(mesaj);	
		
	}
	 

}
