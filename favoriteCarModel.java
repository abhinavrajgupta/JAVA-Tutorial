import java.util.Scanner; // Importing the Scanner class to allow user input

/**	
 * The class favoriteCarModel asks the user to input their favorite car model and displays following information:
 *  a. Number of characters in car model name
 *  b. Car model name in capital letters
 *  c. Car model name in lowercase
 *  d. First character of the car model name
 */

public class favoriteCarModel 
{
    public static void main(String[] args) 
    {
        
        String carModel; // Creating a new String variable named "carModel" to store user's input of favorite car model 

        Scanner keyboard = new Scanner(System.in); // Creating a Scanner object named "keyboard" for user input

        // Asking the user to enter the name of their favorite car model
        System.out.print("Enter the name of your favorite car model: ");
        carModel = keyboard.nextLine();

        // Displaying the number of characters in the car name
        System.out.println("a. Number of characters in the car name: " + carModel.length());

        // Displaying the name of the car model in capital letters
        System.out.println("b. Car model in uppercase: " + carModel.toUpperCase());

        // Displaying the name of the car model in lowercase
        System.out.println("c. Car model in lowercase: " + carModel.toLowerCase());

        // Displaying the first character of the car model
        System.out.println("d. The first character of the car model: " + carModel.charAt(0));

        // Closing the Scanner object
       keyboard.close();
    }
}
