package task1;

public class GiftShop implements Facility {
	
	private String name;
	private String location;
	private String theme;

	public GiftShop() {
		
	}
	
	public GiftShop(String name, String location, String theme) {
		setName(name);
		setLocation(location);
		setTheme(theme);
	}
	
	@Override
	public void type() {
		System.out.println("Type: " + getTheme() + " giftshop");
	}

	@Override
	public void location() {
		System.out.println("Location: " + getLocation());
	}

	@Override
	public void description() {
		System.out.println("Gift Shop name: " + getName());
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	
	

}
