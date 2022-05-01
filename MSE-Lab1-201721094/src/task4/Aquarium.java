package task4;
import java.util.ArrayList;

public class Aquarium {
	private int i = 0;
	//Fish[] fishList = new Fish[10];
	ArrayList<Fish> fishList = new ArrayList<Fish>();
	
	
	public void addFish(String name, String type, float weight) {
		/*
		if(i>10) {
		
			System.out.println("Aquarium is Full!!!!");
			return;
		}
		*/
		Fish newFish = new Fish();
		newFish.setName(name);
		newFish.setType(type);
		newFish.setWeight(weight);
		//fishList[i] = newFish;
		//i++;
		fishList.add(newFish);
	}
	
	public void removeFish(int index) {
		/*
		if(i==0) {
			System.out.println("Aquarium is Empty");
			return;
		}
		//i--;
		//fishList[i] = null;
		if(index>i) {
			System.out.println("Non-existing fish");
			return;
		}
		fishList[index] = null;
		for(int j=index; j<i; j++) {
			fishList[j] = fishList[j+1];
		}
		i--;
		System.out.println("Successfully removed");
		*/
		if(fishList.isEmpty()) {
			System.out.println("Aquarium is Empty");
			return;
		}
		if(index>=fishList.size()) {
			System.out.println("Non-existing fish");
			return;
		}
		fishList.remove(index);
	}
	
	public void printInfo() {
		/*
		if(i==0) {
			System.out.println("Aquarium is Empty");
			return;
		}
		for(int j=0; j<i; j++) {
			System.out.println("index: " + j);
			fishList[j].printName();
			fishList[j].printType();
			fishList[j].printWeight();
			System.out.println("");
		}
		*/
		int temp=0;
		if(fishList.isEmpty()) {
			System.out.println("Aquarium is Empty");
			return;
		}
		for(Fish fish : fishList) {
			System.out.println("index: " + temp++);
			fish.printName();
			fish.printType();
			fish.printWeight();
			System.out.println("");
		}
	}
}
