package task1;

public class RollerCoaster implements Attraction {
	
	private Rail rail;
	private String name;
	private int level;
	private int topSpeed;
	private int runningTime;
	
	public RollerCoaster() {
		
	}
	
	public RollerCoaster(String name, int level, int topSpeed, int runningTime, String material, int length, boolean brakes ) {
		rail = new Rail(material, length, brakes);
		setName(name);
		setLevel(level);
		setTopSpeed(topSpeed);
		setRunningTime(runningTime);
	}
	
	@Override
	public void type() {
		System.out.println("Type: Roller Coaster");
	}
	
	@Override
	public void level() {
		System.out.println("Level: " + level + "/5");
		
	}
	
	@Override
	public void runningTime() {
		System.out.println("Running time: " + getRunningTime() + " minuntes");
	}

	@Override
	public void description() {
		System.out.println("Attraction name: " + getName());
		System.out.println(getName() + " opens at " + openingTime + ", closes at " + closeTime);
		type();
		level();
		topSpeed();		
		runningTime();
		rail.materialInfo();
		rail.lengthInfo();
		System.out.println("Technical team support: " + technicalSupportTeam + "\n\n");
	}
	
	private void topSpeed() {
		System.out.println("Top Speed: " + getTopSpeed() + "km/h");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
}
