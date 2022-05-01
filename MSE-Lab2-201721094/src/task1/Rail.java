package task1;

public class Rail {
	
	private String material;
	private int length;
	private boolean brakes;
	
	public Rail(String material, int length, boolean brakes) {
		setMaterial(material);
		setLength(length);
		setBrakes(brakes);
	}
	
	public void materialInfo() {
		System.out.println("Rails made with " + getMaterial());
	}
	
	public void lengthInfo() {
		System.out.println("Rails length is " + getLength() + "m");
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public boolean isBrakes() {
		return brakes;
	}

	public void setBrakes(boolean brakes) {
		this.brakes = brakes;
	}
	
}
