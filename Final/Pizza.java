package Final;

public class Pizza {

	    // Fields to store the amount of each topping and the price
	     double sausage;
	     double onion;
	     double price;

	    // Constructor that takes in the amount of sausage, onion, and price
	    public Pizza(double sausage, double onion, double price) {
	        this.sausage = sausage;
	        this.onion = onion;
	        this.price = price;
	    }

	    // Getters and setters for the toppings and price
	    public double getSausage() {
	        return sausage;
	    }

	    public void setSausage(double sausage) {
	        this.sausage = sausage;
	    }

	    public double getOnion() {
	        return onion;
	    }

	    public void setOnion(double onion) {
	        this.onion = onion;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
}

	    // Method to display the pizza's toppings and price
	  /*  public void display() {
	        System.out.println("Toppings:");
	        System.out.println("Sausage: " + sausage);
	        System.out.println("Onion: " + onion);
	        System.out.println("Price: $" + price);
	    }
	}
*/

