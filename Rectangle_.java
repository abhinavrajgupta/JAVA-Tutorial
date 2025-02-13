public class Rectangle_ // Class named Rectangle with height and length field
{
	private double height; // Private variable to store height
	private double length; // Private variable to store length

	public void	setHeight (double h) // Method to set height of rectangle
	{
		height = h;
	}
	public double getHeight() // Method to get height of rectangle
	{
		return height;
	}

	public void	setLength (double l) // Method to set length of rectangle
	{
		length = l;
	}
	public double getLength() // Method to get length of rectangle
	{
		return length;
	}

	public double getArea() // Method to calculate Area of rectangle multiplying length and height
	{
		return length * height;
	}

}
