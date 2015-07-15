package assignment;

public class App {
	public static void main(String[] args) {
		
		Building[] building = new Building[3];
		building[0] = new Building("Dihing", 7, 10000);
		building[1] = new Building("Umiam", 9, 9000);
		building[2] = new Building("Brahmaputra", 13, 13000);
		
		
		Tenant[] tenant = new Tenant[5];
		tenant[0] = new Tenant("Thor");
		tenant[1] = new Tenant("Batman");
		tenant[2] = new Tenant("Spiderman");
		tenant[3] = new Tenant("Hulk");
		tenant[4] = new Tenant("Ironman");
		
		
		RentalService service = new RentalService();
		
		try {
			service.rentAFloor(34000, building[0], tenant[1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		service.listOccupancy(building[0]);
	}
}
