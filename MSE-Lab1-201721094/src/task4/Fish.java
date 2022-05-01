package task4;

public class Fish {
	private String type;
	private String name;
	private float weight;
	
	public void printType() {
		System.out.println("Type is: " + type);
	}
	
	public void printName() {
		System.out.println("Name is: " + name);
	}
	
	public void printWeight() {
		System.out.println("Weight is: " + weight + "kg");
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}

}
