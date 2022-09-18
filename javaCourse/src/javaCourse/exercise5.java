package javaCourse;

public class exercise5 {

	public static void main(String[] args) {
		// STRİNG
		
				String text ="today is a beautiful day";
				
				System.out.println("text lenght --> "+text.length());
				System.out.println("7. character --> "+text.charAt(7));
				
				System.out.println(text.concat(" !! "));
				System.out.println(text);
				
				System.out.println(text.startsWith("B"));
				System.out.println(text.startsWith("t"));
				
				System.out.println(text.endsWith("!"));
				char[] characters =new char[5];
				
				text.getChars(0, 5, characters,0);
				
				System.out.println(characters); // today
				
				System.out.println(text.indexOf("a"));
				System.out.println(text.indexOf("ay"));
				System.out.println(text.lastIndexOf("a"));
				
				System.out.println("\n\n");
				
				System.out.println(text.replace(" ", "-"));
				System.out.println(text);
				
				System.out.println(text.substring(2));
				System.out.println(text.subSequence(2, 12));
				
				for(String word : text.split(" ") ) { // find " "
					System.out.println(word);
					
				}
				
				System.out.println(text.toLowerCase());
				System.out.println(text.toUpperCase());
				
				String text2 ="    hey girl   ";
				System.out.println(text2);
				System.out.println(text2.trim());


	}

}
