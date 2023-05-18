package TicketSimulator;

public class ParkingMeter {
	 private int mins;

	   public ParkingMeter(int mins) {
	       this.mins = mins;
	   }

	   public int getMins() {
	       return mins;
	   }

	   public void setMins(int mins) {
	       this.mins = mins;
	   }

	   public String toString() {
	       return "ParkingMeter [mins=" + mins + "]";
	   }

	}
