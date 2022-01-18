
public class Plant {
	private String name;		//common name
	private String latinName;	//latin name
	private String date;		//date acquired
	private String care;		//details for care
	private String dateWatered;	//date watered
	
	/**
	 * Constructor for Plant
	 * @param name
	 * @param latinName
	 * @param date
	 * @param care
	 */
	public Plant(String name, String latinName, String date, String care) {
		this.name = name;
		this.latinName = latinName;
		this.date = date;
		this.care = care;
		this.dateWatered = "Info unavailable";
	}
	
	/**
	 * Returns String of all plant details in a nicely formatted lump
	 * 
	 */
	public String toString() {
		String details = "Name: " + this.name + "\n";
		details += "Latin Name: " + this.latinName + "\n";
		details += "Date Aquired: " + this.date + "\n";
		details += "Care Required: " + this.care + "\n";
		details += "Date Last Watered: " + this.dateWatered;
		return details;
	}
	
	//getter for name
	public String getName() {
		return this.name;
	}
	
	//getter for latinName
	public String getLatinName() {
		return this.latinName;
	}
	
	//getter for date
	public String getDate() {
		return this.date;
	}
	
	//getter for care
	public String getCare() {
		return this.care;
	}
	
	//getter for dateWatered
	public String getWatered() {
		return this.dateWatered;
	}
	
	//setter for dateWatered
	public void setWatered(String dateWatered) {
		this.dateWatered = dateWatered;
	}
}
