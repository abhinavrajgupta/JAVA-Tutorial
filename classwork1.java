// Rectangle_demo

// package p_9_09_24_002;

// public class Rectangle_demo
// {
// 	public static void main(String[] args) 
// 	{
// 		Rectangle_r1 = new Rectangle_();
// 		r1.setHeight(20);
// 		system.out.println("The height of the rectangle r1" + " is " + r1.getHeight());
// 		r1.setLength(10);
// 		system.out.println("The length of the rectangle r1" + " is " + r1.getLength());
// 		system.out.println("The Area of the rectangle r1" + " is " + r1.getArea());
// 	}

// }


package p_9_09_24_002;

public class Rectangle_demo
{
    public static void main(String[] args) 
    {
        Rectangle_ r1 = new Rectangle_();  // Corrected object initialization
        r1.setHeight(20);
        System.out.println("The height of the rectangle r1 is " + r1.getHeight());
        r1.setLength(10);
        System.out.println("The length of the rectangle r1 is " + r1.getLength());
        System.out.println("The Area of the rectangle r1 is " + r1.getArea());
    }
}
