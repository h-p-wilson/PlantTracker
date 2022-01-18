import java.util.ArrayList;

public class PlantTracker {
	private static ArrayList<Plant> plants;
	
	public PlantTracker(){ 
		plants= new ArrayList<Plant>();
	}
	
	public boolean addPlants(String name, String latinName, String date) {
		System.out.println("Adding a plant");
		return true;
	}
}
