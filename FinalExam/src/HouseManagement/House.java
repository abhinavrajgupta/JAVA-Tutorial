package HouseManagement;

public abstract class House {
	private String type;
	private String location;
	
	public House(String type, String location) {
		this.type = type;
		this.location = location;
	}

	public House() {
		this.type="";
		this.location="";
	}

	 public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
