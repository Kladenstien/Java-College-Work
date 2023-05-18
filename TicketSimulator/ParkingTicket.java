package TicketSimulator;

public class ParkingTicket {

	// referencing other classes into ParkingTicket Class
	
	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int minutes;
	
	
	//Declaring rates for variables in order to calculate Fine
	double BASE_FINE = 25; 
	double HOURLY_FINE = 10.0;
	
	//Using rates and variables in order to calculate a cost of ticket
	public void calculateFine() {
		fine = BASE_FINE + HOURLY_FINE * (minutes/60 - 1);
	}
	
	//creating ticket2
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutes) {
	       this.car = car;
	       this.officer = officer;
	       
	   }
	public ParkingTicket(ParkingTicket ticket2) {
		 this.car = ticket2.getcar();
		this.officer= ticket2.getofficer();
		}
	
	
	//Get and set methods in other to call reference data from outside ParkingTicket
	
	public ParkedCar getcar()
	{return car;}
	
	public void setParkedcar(ParkedCar car)
	{this.car = car;}
	
	public PoliceOfficer getofficer()
	{return officer;}
	
	public void setOficer(PoliceOfficer officer) 
	{this.officer = officer;}
	
	public double getFine() 
	{return fine;}
	
	public void setFine(double fine) 
	{this.fine = fine;}
	
	public int getminutes()
	{return minutes;}  
	
	public void setMinutes(int minutes) 
	{this.minutes = minutes;}
	
	
	
	
	
	
	
}
