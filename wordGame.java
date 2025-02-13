import java.util.Scanner; // Importing the Scanner class to allow user input

/**	
 * The class wordGame asks user for the following information:
 * a. Their name
 * b. Their age
 * c. The name of city
 * d. The name of a college 
 * e. A profession
 * f. A type of animal
 * g. A pet’s name
 */

public class wordGame
{
	public static void main(String[] args)
	 {
		String NAME; // Creating a String variable named "NAME" to store user's name
		int AGE; // Creating a int variable named "AGE" to store user's age
		String CITY; // Creating a String variable named "CITY" to store name of city
		String COLLEGE; // Creating a String variable named "COLLEGE" to store name of college
		String PROFESSION; // Creating a String variable named "PROFESSION" to store name of the profession
		String ANIMAL; // Creating a String variable named "ANIMAL" to store a type of animal
		String PETNAME; // Creating a String variable named "PETNAME" to store name of animal

		Scanner keyboard = new Scanner(System.in); // Creating a Scanner object named "keyboard" for user input

        // Asking the user to enter their name and storing in NAME variable
        System.out.print("Enter your name: ");
        NAME = keyboard.nextLine();

        // Asking the user to enter their age and storing in AGE variable
        System.out.print("How old are you?: ");
        AGE = keyboard.nextInt();

        // Giving a newLine character after reading integer value
        keyboard.nextLine();

        // Asking the user to enter the name of city and storing in CITY variable
        System.out.print("Which city are you from?: ");
        CITY = keyboard.nextLine();

        // Asking the user to enter the name of college and storing in COLLEGE variable
        System.out.print("What college did you go?: ");
        COLLEGE = keyboard.nextLine();

        // Asking the user to enter the name of their profession and storing in PROFESSION variable
        System.out.print("What's your profession?: ");
        PROFESSION = keyboard.nextLine();

        // Asking the user to enter a kind of animal and storing in ANIMAL variable
        System.out.print("Enter a kind of animal: ");
        ANIMAL = keyboard.nextLine();

        // Asking the user to enter the petname for the animal and storing in PETNAME variable
        System.out.print("Enter pet name for the animal: ");
        PETNAME = keyboard.nextLine();

        // Printing the desired output as a full sentence
        System.out.println("There once was a person named " + NAME + " who lived in " + CITY + "." + " At the age of " + AGE + ", " + NAME + " went to college at " + COLLEGE + ". " + NAME + " graduated and went to work as a " + PROFESSION + "." + " Then, " + NAME + " adopted a(n) " + ANIMAL + " named " + PETNAME + "." + " They both lived happily ever after!");

        

        // Closing the Scanner object
       keyboard.close();
	}
}
