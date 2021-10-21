package javaBikeShopProject;

public class Bike {
	
	String factory;
	String model;
	int year;
	int engineCc;
	int price;

public Bike(String factory, String model, int year, int engineCc, int price) {
		super();
		this.factory = factory;
		this.model = model;
		this.year = year;
		this.engineCc = engineCc;
		this.price = price;
	}

public void info() {
	System.out.println("Manufacturing company: " + factory);
	System.out.println("Model: " + model);
	System.out.println("Year: " + year);
	System.out.println("Engine: " + engineCc + "cc");
	System.out.println(price + " Euros");
  }
}
