import java.util.Scanner;

 class FavoriteCarModel {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        String carModel;

        Scanner keyboard = new Scanner(System.in);

        // Ask the user to enter the name of their favorite car model
        System.out.print("Enter the name of your favorite car model: ");
        carModel = keyboard.nextLine();

        // Display the number of characters in the car name
        System.out.println("a. Number of characters in the car name: " + carModel.length());

        // Display the name of the car model in all uppercase letters
        System.out.println("b. Car model in uppercase: " + carModel.toUpperCase());

        // Display the name of the car model in all lowercase letters
        System.out.println("c. Car model in lowercase: " + carModel.toLowerCase());

        // Display the first character in the name of the car model
        System.out.println("d. The first character of the car model: " + carModel.charAt(0));

        // Close the scanner to avoid resource leaks
       keyboard.close();
    }
}