import java.util.ArrayList;

public class PlantTracker {
	private static ArrayList<Plant> plants;
	
	public PlantTracker(){ 
		plants= new ArrayList<Plant>();
	}
	
	public boolean addPlants(String name, String latinName, String date, String care) {
		if (name != null && latinName != null && date != null && care != null) {
			Plant plant = new Plant(name, latinName, date, care);
			plants.add(plant);
			return true;
		}
		return false;
	}
	
	public String[] getPlantList() {
		if (plants.size()>0 ) {
			String plantList[] = new String[plants.size()];
			for (int i = 0; i < plantList.length; i++) {
				Plant plant = plants.get(i);
				String str = plant.getName();
				plantList[i] = str;
			}
			return plantList;
		} else {
			return null;
		}
	}
	
	public String getPlant(int choice) {
		Plant plantObj = plants.get(choice-1);
		String plant = plantObj.toString();
		return plant;
	}
	
}
