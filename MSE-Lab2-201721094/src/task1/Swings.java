package task1;

public class Swings implements Attraction {
	
	private String name;
	private int level;
	private int runningTime;
	
	public Swings() {
		
	}
	
	public Swings(String name, int level, int runningTime) {
		setName(name);
		setLevel(level);
		setRunningTime(runningTime);
	}
	
	@Override
	public void type() {
		System.out.println("Type: Swings");
	}
	
	@Override
	public void level() {
		System.out.println("Level: " + level + "/5");
	}
	
	@Override
	public void description() {
		System.out.println("Attraction name: " + getName());
		System.out.println(getName() + " opens at " + openingTime + ", closes at " + closeTime);
		type();
		level();
		runningTime();
		System.out.println("Technical team support: " + technicalSupportTeam + "\n\n");
	}
	
	@Override
	public void runningTime() {
		System.out.println("Running Time: " + getRunningTime() + " minutes");
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

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
}
