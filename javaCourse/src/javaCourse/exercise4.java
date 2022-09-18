package javaCourse;

public class exercise4 {

	public static void main(String[] args) {
		// ARRAYS
		
				double[] myList = {1.2,1.3,4.5,7.5};
				
				double total =0;
				double maxNumber = myList[0];
				for(double number:myList) {
					System.out.println(number);
					total=total+number;
					if(maxNumber<number) {
						maxNumber=number;
					}
						
				}
				System.out.println("total --> "+total);
				System.out.println("Max Number --> "+maxNumber);
				System.out.println("---------------------------");
			    System.out.println("---------------------------");

				
				//MULTİ ARRAYS
				
				String[][] cities=new String[3][3];
				cities[0][0]="istanbul";
				cities[0][1]="bursa";
				cities[0][2]="bilecik";
				cities[1][0]="adana";
				cities[1][1]="konya";
				cities[1][2]="kayseri";
				cities[2][0]="diyarbakır";
				cities[2][1]="şanlıurfa";
				cities[2][2]="gaziantep";
				
				for(int i=0;i<=2;i++ ) {
					System.out.println("*********");
					for(int j=0;j<=2;j++) {
						
						System.out.println(cities[i][j]);
					}
				}
	}

}
