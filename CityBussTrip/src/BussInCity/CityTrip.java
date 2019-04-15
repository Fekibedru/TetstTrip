//package name
package BussInCity;

//class name
public class CityTrip {
	
	private String depart;
	private String departTime;
	private String destination;
	private String arrivalTime;
	private int busNumber;
	private int zones;
	private double cost;
	private int coupons;

	// Default Constructor
	CityTrip(){
		
	}
	//Constructor
	CityTrip(String depart, String departTime, 
			String destination, String arrivalTime, int busNumber){
		this.depart = depart;
		this.departTime = departTime;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.busNumber = busNumber;
	}
	CityTrip(String depart, String departTime, String destination, String arrivalTime,
			int busNumber,int zones, double cost,int coupons){
		this.depart = depart;
		this.departTime = departTime;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.busNumber = busNumber;
		this.zones = zones;
		this.cost = cost;
		this.coupons = coupons;
	}
	
	
	//getter and setter methods
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		if (depart != null && !depart.isEmpty())
			this.depart = depart;
		this.depart = depart;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		//DepatTime should not be empty or null
		if (departTime != null && !departTime.isEmpty())
		this.departTime = departTime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		//arrival Time should not be empty or null
		if(arrivalTime != null && !(arrivalTime.isEmpty())) {
			this.arrivalTime = arrivalTime;
		}
		else {
			System.out.println("arrival time should not be zero or empty");
		}
	
	}
	public int getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(int busNumber) {
		//buss number should be greater or equal to zero
				if(busNumber >=0) {
					this.busNumber = busNumber;
				}
				else {
					System.out.println("buss numbe should be greaer thatn zero");
				}			
	}
	
	
	public int getZones() {
		return zones;
	}
	public void setZones(int zones) {
		this.zones = zones;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getCoupons() {
		return coupons;
	}
	public void setCoupons(int coupons) {
		this.coupons = coupons;
	}
	public void PrintOut() {
		System.out.println("From: " + this.getDepart() + " ("
				+ this.getDepartTime() + ") " + "To: " + this.getDestination()
				+ " (" + this.getArrivalTime() + ")" + " using bus: "
				+ this.getBusNumber());
	}
	public void printStandards() {
		System.out.println("\t This trip crosses " + this.getZones()
				+ " zones and costs " + this.getCost() + " SEK ("
				+ this.getCoupons() + " coupons).");
	}
}
