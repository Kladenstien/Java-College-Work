package Final;

public class DeliveryPizza extends Pizza{
	//public class DeliveryPizza extends Pizza {
	    // Fields to store the delivery fee and address
	    private double Del_Fee;
	    private String Del_Address;
	    double Total = Del_Fee + price;

	    // Constructor that takes in the toppings, price, delivery fee, and delivery address
	    public DeliveryPizza(double sausage, double onion, double price, String Del_Address) {
	        super(sausage, onion, price); 
	        this.Del_Address = Del_Address;
	        if (price > 15.0) {
	            this.Del_Fee = 3.0;
	        } else {
	            this.Del_Fee = 5.0;
	        }
	    }

	    
	    
	  /*  public DeliveryPizza(double sausage, double onion, double price, String Del_Address) {
	        super(sausage, onion, price);
	        this.Del_Address = Del_Address;
	        if (price > 15.0) {
	            this.Del_Fee = 3.0;
	        } else {
	            this.Del_Fee = 5.0;
	        }
	    }*/

	    
	    
	    
	    // Getters and setters for the delivery fee and address
		public double getDel_Fee() {
			return Del_Fee;
		}

		public void setDel_Fee(double del_Fee) {
			Del_Fee = del_Fee;
		}

		public String getDel_Address() {
			return Del_Address;
		}

		public void setDel_Address(String del_Address) {
			Del_Address = del_Address;
		}

		
	    // Overrides the display method to include the delivery fee and address
	   
	    public void display(){
	       // super.display(); 
	        System.out.println("Toppings:");
	        System.out.println("Sausage: " + sausage);
	        System.out.println("Onion: " + onion);
	        System.out.println("Price: $" + price);
	        System.out.println("Delivery Fee: $" + Del_Fee);
	        System.out.println("Delivery Address: " + Del_Address);
	        System.out.println("Your Total is " + Total + " Also includes the delivery fee of " + Del_Fee );
	    }

	
	}



