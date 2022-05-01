package task1;

public class Restaurants implements Facility {

	private String name;
	private String menu;
	private String location;
	
	public Restaurants() {
		
	}
	
	public Restaurants(String name, String menu, String location) {
		setName(name);
		setMenu(menu);
		setLocation(location);
	}
	

	@Override
	public void type() {
		System.out.println("Type: " + getMenu() + " restaurants");
	}
	
	@Override
	public void location() {
		System.out.println("Location: " + getLocation());
	}
	
	@Override
	public void description() {
		System.out.println("Restaurant name: " + getName());
		System.out.println(getName() + " opens at " + openingTime + ", closes at " + closeTime);
		type();
		location();
		System.out.println("Technical team support: " + technicalSupportTeam + "\n\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
