package CabBookingSystem;

public class Details {
	int CusId;
	String name;
	int PhoneNumber;
	String PickUpDestination;
	String DropDestinamtion;
	int timeOftravel;
	int NoOfPassenger;
	int time;
	
	
	public Details(int CusId,String name, int phoneNumber, String pickUpDestination, String dropDestinamtion, int timeOftravel,
			 int noOfPassenger, int time) {
		this.CusId = CusId;
		this.PhoneNumber = phoneNumber;
		this.PickUpDestination = pickUpDestination;
		this.DropDestinamtion = dropDestinamtion;
		this.timeOftravel = timeOftravel;
		this.NoOfPassenger = noOfPassenger;
		this.time = time;
	}
	
	
	@Override
	public String toString() {
		return "Details [CusId=" + CusId + ", PhoneNumber=" + PhoneNumber + ", PickUpDestination=" + PickUpDestination
				+ ", DropDestinamtion=" + DropDestinamtion + ", timeOftravel=" + timeOftravel +  " NoOfPassenger=" + NoOfPassenger + ", time=" + time + "]";
	}
	
	
}
