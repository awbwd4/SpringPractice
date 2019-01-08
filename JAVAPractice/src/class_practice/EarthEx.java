package class_practice;

public class EarthEx {

/*	public static void main(String[] args) {

		System.out.println(Earth.EARTH_RADIUS);
		System.out.println(Earth.EARTH_SURFACE_AREA);
		
		
	}*/
}



class Earth{
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	
	static {
		EARTH_SURFACE_AREA = 4 *Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
	
	
	
	
}
