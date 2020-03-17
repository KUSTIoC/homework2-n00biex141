public class DateClass{
	private int Date, Month, Year;
	private static final int[] DaysPerMonth =
	{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // we want to keep the values same so that's why we use static
	
	public DateClass(int date, int month, int year){
		//For checking the date
		if(date < 0 || date > 31 || Date > DaysPerMonth[month] && !(month == 2 && date == 29))
			throw new IllegalArgumentException("Date (" + date + ") must be 1-31");
		
		//Checking if we got any case of leap year
		if(month == 2 && date == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("Date (" + date + ") out of range for the specific month and year");
		
		//For checking the month
		if(month <= 0 || month > 12)
			throw new IllegalArgumentException("Month (" + month + ") must be 1-12");
		
		Date = date;
		Month = month;
		Year = year;		
	}
	
	public String toString(){
		return String.format("%d/%d/%d", Date, Month, Year);
	}

}