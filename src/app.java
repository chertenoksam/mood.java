import java.util.Scanner;

/* ### mood.java

Ask the user for their mood for the day, then: 
- Print the length of the string they return
- Print the string with 'I remember when I was' prepended to it
- - For example, if I was the User and I typed "Sleepy". The following would be printed out
- - 6 
- I remember when I was Sleepy */

public class app {

	public static void main(String[] args) {
		System.out.println("Hello there! How are you doing?");
		
		Scanner scanner = new Scanner(System.in);
		String mood = scanner.nextLine();
		
		System.out.println("You are " + mood);
		System.out.println("I remember when I was " + mood);
		
		int length = mood.length();
		System.out.println("Length of a string is " + length);
		
	}

}
