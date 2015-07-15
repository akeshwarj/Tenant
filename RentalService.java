package assignment;

public class RentalService {
	
	void rentAFloor(int area, Building building, Tenant tenant) throws Exception {
			//allot a floor to the tenant if available
		
		if (area < building.areaPerFloor*building.floorsAvailable) {
			int floorsRented = (int)(area/building.areaPerFloor + 1);
			System.out.println(floorsRented);

			for (int i=0; i<floorsRented;) {				//scan from the bottom and fill the available floors.
				if (building.tenantName[i].equals("0")) {
					building.tenantName[i] = tenant.name;
					i++;
				}
			}
			building.floorsAvailable -= floorsRented;			
		}
		else {
			throw new Exception("RentalUnavailable Exception");
		}
	}
		
	void vacateAFloor(Building building, Tenant tenant, int floor) {
		/*
		 * if any floor in that building is occupied by that tenant
		 * mark it as available
		 */
		if (building.tenantName[floor].equals(tenant.name)) {
			building.tenantName[floor] = "0";
		}
		building.floorsAvailable--;
	}
	
	void listOccupancy(Building building) {
		//will print the tenants occupying each building
		for (int floor=0; floor < building.numFloors; floor++) {
			System.out.println("Floor Number " + floor + " is occupied by " + building.tenantName[floor]);
		}
	}
}
