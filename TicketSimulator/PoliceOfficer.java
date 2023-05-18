package TicketSimulator;

public class PoliceOfficer {
		   private String name;
		   private String badgeNumber;

		   public PoliceOfficer(String name, String badgeNumber) {
		       this.name = name;
		       this.badgeNumber = badgeNumber;
		   }

		   public PoliceOfficer(PoliceOfficer officer2) {
		       this.name = officer2.getName();
		       this.badgeNumber = officer2.getBadgeNumber();
		   }

		   public String getName() {
		       return name;
		   }

		   public void setName(String name) {
		       this.name = name;
		   }

		   public String getBadgeNumber() {
		       return badgeNumber;
		   }

		   public void setBadgeNumber(String badgeNumber) {
		       this.badgeNumber = badgeNumber;
		   }

		   public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
		ParkingTicket pt=new ParkingTicket(car,new PoliceOfficer(name, badgeNumber),meter.getMins());
		return pt;
		   }

		   public String toString() {
		       return "Officer Data:\nName" + name + "\nBadge Number:" + badgeNumber+"\n";
		   }

		}


