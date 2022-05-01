package task1;

public class Cafe implements Facility {
	
	private String name;
	private String location;
	private double rating;

	public Cafe() {
		
	}
	
	public Cafe(String name, String location, double rating) {
		setName(name);
		setLocation(location);
		setRating(rating);
	}
	
	@Override
	public void type() {
		System.out.println("Type: Cafe");
		
	}

	@Override
	public void location() {
		System.out.println("Location: " + getLocation());
	}
	
	@Override
	public void description() {
		System.out.println("Cafe name: " + getName());
		System.out.println(getName() + " opens at " + openingTime + ", closes at " + closeTime);
		type();
		location();
		rating();
		System.out.println("Technical team support: " + technicalSupportTeam + "\n\n");
	}
	
	private void rating() {
		System.out.println("Ratings: " + getRating() + "/5");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	
	

}
