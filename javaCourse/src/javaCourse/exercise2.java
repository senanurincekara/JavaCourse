package javaCourse;

public class exercise2 {

	public static void main(String[] args) {
		// SWİTCH BLOCKS

				char grade = 'F';

				switch (grade) {

				case 'A':

					System.out.println("Perfect : You Passed");
					break;
				case 'B':
					System.out.println("Very Good : You Passed");
					break;
				case 'C':
					System.out.println("Good : You Passed");
					break;
				case 'D':
					System.out.println("Not Bad : You Passed");
					break;
				case 'F':
					System.out.println("FAİL");
					break;

				default:
					System.out.println("invalid note");

				}

	}

}
