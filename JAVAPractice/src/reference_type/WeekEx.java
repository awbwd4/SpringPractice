package reference_type;

import java.util.Calendar;
import java.util.Iterator;

public class WeekEx {

	public static void main(String[] args) {
		Week today = null;
		
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNEDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println(today);
		
		
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.print(day+" ");
		}
		
		
		
	}
	
	
	
	
}


enum Week {
	MONDAY,
	TUESDAY,
	WEDNEDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}