public class Rectangle_demo  // Referring to use Rectangle_ class
{
    public static void main(String[] args) // Main Method to print outputs
    {
        Rectangle_ r1 = new Rectangle_ ();  // Creating new object of Rectangle_ class
        //r1.height(20) could be done if height was public field
        r1.setHeight(20); // Setting height of rectangle r1 to 20 
        System.out.println("The height of the rectangle r1 is " + r1.getHeight()); // Printing height
        r1.setLength(10); // Setting length of rectangle r1 to 10 
        System.out.println("The length of the rectangle r1 is " + r1.getLength()); // Printing length
        System.out.println("The Area of the rectangle r1 is " + r1.getArea()); // Printing Area
    }
}
