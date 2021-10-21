package javaBikeShopProject;

public class Scooter {

	String factory;
	String model;
	int year;
	int engine;
	int price;
	
	public Scooter(String factory, String model, int year, int engine, int price) {
		super();
		this.factory = factory;
		this.model = model;
		this.year = year;
		this.engine = engine;
		this.price = price;
	}
	
	public void info() {
		System.out.println("Manufacturing company: " + factory);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Engine: " + engine + "cc");
		System.out.println("Price: " + price + " Euros");
	}
}
