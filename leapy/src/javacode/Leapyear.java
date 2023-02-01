package javacode;

public class Leapyear {

	public static void isLeapyear(int year) {
		boolean is_leap_year = false;
		
		if(year % 4 ==0 ) {
			is_leap_year = true;
			if (year % 100 == 0) {
				if(year % 400 == 0)
					is_leap_year = true;
				else
					is_leap_year = false;
			}
		}
		else
			is_leap_year = false;
		if(!is_leap_year)
			System.out.println(year + ": Non Leap Year");
		else
			System.out.println(year + ": Leap Year");
	}
	public static void main(String[] args) {
		isLeapyear(2000);
		
		isLeapyear(2002);

	}

}
