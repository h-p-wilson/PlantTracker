import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class Interface {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		
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
		case 1: System.out.println("Viewing Plants");
				break;
		case 2: System.out.println("Adding Plants");
				break;
		case 3: System.out.println("Showing Credits");
				break;
		}
		
	}
	
	

}
