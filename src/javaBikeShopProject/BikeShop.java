package javaBikeShopProject;

public class BikeShop {
	public static void main(String[] args) {
		
		Bike bike1 = new Bike("Honda", "Hornet", 2003, 900, 2600);
		Bike bike2 = new Bike("Harley Davidson", "Fat Bob", 2017, 1745, 17900);
			
		bike1.info();
		System.out.println("");
		bike2.info();
	}
}
