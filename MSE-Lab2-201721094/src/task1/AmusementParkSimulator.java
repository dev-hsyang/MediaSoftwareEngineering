package task1;

public class AmusementParkSimulator {

	public static void main(String[] args) {
		
		RollerCoaster xtrain = new RollerCoaster("Rolling X Train", 4, 120, 2, "WOOD", 3500, true);
		RollerCoaster atlantis = new RollerCoaster("Legend of the Atantis", 5, 143, 3, "Alluminium", 2800, true);
		Swings rockSpin = new Swings("Double Rock Spin", 3, 4);
		Zoo zootopia = new Zoo("Zootopia", "Safari", 2, 15);
		Carousel royalCarousel = new Carousel("Royal Carousel", 1, 3);
		Restaurants ajouRestaurant = new Restaurants("Ajou Restaurant", "Korean", "Site A");
		Restaurants familyR = new Restaurants("Outback SteakHouse", "Western dishes", "Site B");
		Cafe starbucks = new Cafe("Starbucks", "Site C", 4.8);
		Snacks churros = new Snacks("Number One", "Churros", "Site D");
		GiftShop memorialShop = new GiftShop("Memorial Shop", "Site A", "Character");
		
		System.out.println("Welcome to Ajou amusement park\n\n\n");
		
		System.out.println("Attractions===============================\n");
		royalCarousel.description();
		xtrain.description();
		atlantis.description();
		rockSpin.description();
		zootopia.description();
	
		
		System.out.println("\nFacilities===============================\n");
		ajouRestaurant.description();
		familyR.description();
		starbucks.description();
		churros.description();
		memorialShop.description();
	
	}

}