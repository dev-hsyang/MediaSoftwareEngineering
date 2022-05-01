package task4;
import java.util.Scanner;

public class FishSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aquarium aquarium = new Aquarium();
		Scanner scan = new Scanner(System.in);
		while(true) {
			int i=0;
			System.out.println("-------------------------------------");
			System.out.println("Welcome to the Aquarium manage system\n");
			System.out.println("Select menu: \n1. Add new Fish \n2. Print the fishes in the aquarium \n3. Remove Fish \n4. Modify \n5. Exit");
			i = scan.nextInt();
			
			switch(i) {
			case 1:
				addNewFish(aquarium);
				break;
			case 2:
				printFishes(aquarium);
				break;
			case 3:
				removeFish(aquarium);
				break;
			case 4:
				modify(aquarium);
				break;
			case 5:
				return;
			default:
				System.out.println("Wrong input");
			}
			System.out.println("");
		}

	}
	
	public static void addNewFish(Aquarium aquarium) {
		Scanner scan = new Scanner(System.in);
		String fishName;
		String fishType;
		float fishWeight;
		System.out.println("Fish name is: ");
		fishName = scan.next();
		System.out.println("Fish type is: ");
		fishType = scan.next();
		System.out.println("Fish's weight(kg) is: ");
		fishWeight = scan.nextFloat();
		aquarium.addFish(fishName, fishType, fishWeight);
	}
	
	public static void printFishes(Aquarium aquarium) {
		aquarium.printInfo();
	}
	
	public static void removeFish(Aquarium aquarium) {
		Scanner scan = new Scanner(System.in);
		int index;
		System.out.print("Enter the index of the fish to remove -> ");
		index = scan.nextInt();
		aquarium.removeFish(index);
		System.out.println("Successfully removed");
	}
	
	public static void modify(Aquarium aquarium) {
		Scanner scan = new Scanner(System.in);
		if(aquarium.fishList.isEmpty()) {
			System.out.println("Nothing to modify, aquarium is empty.");
			return;
		}
		System.out.println("     Select modify menu: \n     1. Name \n     2. Type\n     3. Weight\n");
		int i = scan.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("     Index to modify -> ");
			int k = scan.nextInt();
			System.out.println("     Type in new name -> ");
			String name = scan.next();
			aquarium.fishList.get(i).setName(name);
			System.out.println("     Successfully modifed");
			break;
		case 2:
			System.out.println("     Index to modify -> ");
			int j = scan.nextInt();
			System.out.println("     Type in new type -> ");
			String type = scan.next();
			aquarium.fishList.get(j).setType(type);
			System.out.println("     Successfully modifed");
			break;
		case 3:
			System.out.println("     Index to modify -> ");
			int m = scan.nextInt();
			System.out.println("     Type in new weight ->");
			int weight = scan.nextInt();
			aquarium.fishList.get(m).setWeight(weight);
			System.out.println("     Successfully modifed");
			break;
		default:
			System.out.println("Wrong input");
		}
	}

}
