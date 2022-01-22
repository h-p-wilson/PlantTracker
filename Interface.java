import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.util.Scanner;  

public class Interface {
	private static PlantTracker plantTracker = new PlantTracker();
	private static Scanner input = new Scanner(System.in);
	private static java.util.Date date = new java.util.Date();
	
	public static void main(String[] args) {		
		System.out.println("+-+-+-Welcome to PlantTracker!-+-+-+");
		System.out.println("It is now " + date);
		
		String options[] = {"View your plants", "Add new plants", "View Credits", "Exit"};
		Menu menu = new Menu("\nWhat would you like help with today?", options);
		int quitOption = options.length;
		boolean done = false;
		int choice;

		do {
			choice = menu.getUserChoice();
			if (choice == quitOption) {
				done = true;
			} else {
				processOption(choice);
			}
		} while (!done);
		System.out.println("Thank you for using PlantTracker!");
	
	}

	private static void processOption(int choice) {
		switch(choice) {
		case 1: viewPlants();
				break;
		case 2: addPlants();
				break;
		case 3: viewCredits();
				break;
		}
		
	}
	
	private static void viewPlants() {
		System.out.println("\n+-+-+-Viewing Plants-+-+-+");
		String[] plants = plantTracker.getPlantList();
		if (plants != null) {
			Menu menu = new Menu("Choose a plant to view", plants);
			int quitOption = plants.length;
			boolean done = false;
			int choice;
			choice = menu.getUserChoice();
			System.out.println(plantTracker.getPlantString(choice));
			String[] options = {"Yes", "No"};
			Menu menu1 = new Menu("Would you like to water this plant?", options);
			int choice1 = menu1.getUserChoice();
			if  (choice1 == 1) {
				plantTracker.getPlant(choice1).setWatered(date);
				System.out.println("This Plant has been Watered");
			}
			
		} else {
			System.out.println("You currently have no plants listed");
		}
	}
	
	private static void addPlants() {
		System.out.println("\n+-+-+-Adding a Plant-+-+-+");
		System.out.println("Name: ");
		String name = input.nextLine();
		System.out.println("Latin Name: ");
		String latinName = input.nextLine();
		System.out.println("Date: ");
		String date = input.nextLine();
		System.out.println("Care: ");
		String care = input.nextLine();
		if (plantTracker.addPlants(name, latinName, date, care)) {
			System.out.println("This plant has been added to your list");
		} else {
			System.out.println("Unfortunately there was an error. Please try again");
		}
	}

	private static void viewCredits() {
		System.out.println("\n+-+-+-Credits-+-+-+");
		System.out.println("It was all me!!!!!");
	}
}
