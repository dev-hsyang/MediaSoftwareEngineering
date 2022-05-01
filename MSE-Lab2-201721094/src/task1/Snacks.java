package task1;

public class Snacks implements Facility{

	private String name;
	private String menu;
	private String location;
	
	
	public Snacks() {
		
	}
	
	public Snacks(String name, String menu, String location) {
		setName(name);
		setMenu(menu);
		setLocation(location);
	}
	
	@Override
	public void type() {
		System.out.println("Type: Snack bar, Menu: " + getMenu());
	}


	@Override
	public void location() {
		System.out.println("Location: " + getLocation());
	}
	
	@Override
	public void description() {
		System.out.println("Snack Bar name: " + getName());
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

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	

	
	

}
