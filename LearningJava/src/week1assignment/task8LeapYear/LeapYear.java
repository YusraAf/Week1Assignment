package week1assignment.task8LeapYear;


public class LeapYear {
	
	public int year;
	

public boolean isValidYear(int year) {
	boolean result=false;

	if((year % 4==0 && year % 100 !=0) || year % 400==0) {
		result= true;
	}
	
	return result;
}
}
