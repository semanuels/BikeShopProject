package javaBikeShopProject;

public class BikeShop {
	public static void main(String[] args) {
		
		Bike bike1 = new Bike("Honda", "Hornet", 2003, 900, 2600);
		Bike bike2 = new Bike("Harley Davidson", "Fat Bob", 2017, 1745, 17900);
		
		Scooter scooter1 = new Scooter("Aprilia","Sr50r", 2007, 49, 950);
		Scooter scooter2 = new Scooter("Piaggio","X9", 2001, 182, 1250);
		
		
		System.out.println("Bikes");
		System.out.println("");
		bike1.info();
		System.out.println("");
		bike2.info();
		System.out.println("");
		System.out.println("Scooters");
		System.out.println("");
		scooter1.info();
		System.out.println("");
		scooter2.info();
		
	}
}
