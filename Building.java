package assignment;

public class Building {
	String name;
	int numFloors;
	double areaPerFloor;
	int floorsAvailable;
	String[] tenantName;
	
	Building(String name, int numFloors, double areaPerFloor) {
		this.name = name;
		this.areaPerFloor = areaPerFloor;
		this.numFloors = numFloors;
		this.floorsAvailable = numFloors;			//because ground floor is included.
		tenantName = new String[numFloors];
		System.out.println(tenantName.length);
		for(int i=0; i<numFloors; i++)
			this.tenantName[i] = "0";
	}	
}
