package HouseManagement;

public class HouseDemo {
	public static void main (String[] args) {
		Apartment apt = new Apartment("villa", "Lubbock",100,true);
		System.out.println("Apartment Type: " + apt.getType());
		System.out.println("Apartment Location: " + apt.getLocation());
		System.out.println("Number of Rooms: " + apt.getNumRooms());
		System.out.println("Has a Balcony? " + apt.isHasBalcony());
	}
}
