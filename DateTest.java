//3.14
import java.util.Scanner;
public class DateTest{
	public static int date, month, year;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		DateClass date = new DateClass(29, 02, 2020);
		
		System.out.print(date);
	}
}