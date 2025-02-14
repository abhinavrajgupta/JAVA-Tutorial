package HouseManagement;

public class Apartment extends House implements HouseDetails {
	private int numRooms;
	private boolean hasBalcony;
	
	
	public Apartment(String type, String location) {
		super(type, location);
		this.numRooms = 0;
		this.hasBalcony = false;
	}


	public Apartment(String type, String location, int numRooms, boolean hasBalcony) {
		super(type, location);
		this.numRooms = numRooms;
		this.hasBalcony = hasBalcony;
	}


	public int getNumRooms() {
		return numRooms;
	}


	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}


	public boolean isHasBalcony() {
		return hasBalcony;
	}


	public void setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}


	@Override
	public String getType() {
		return super.getType();
	}


	@Override
	public void setType(String type) {
		super.setType(type);
	}



	@Override
	public String getLocation() {
		return super.getLocation();
	}


	@Override
	public void setLocation(String location) {
		super.setLocation(location);
	}
}
