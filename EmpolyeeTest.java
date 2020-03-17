//3.13
public class EmpolyeeTest{
	public static String fname;
	public static String lname;
	public static double salary;
	
	public static void main(String[] args){
		EmpolyeeClass empolyee1 = new EmpolyeeClass("Ali", "Khan", 20000);
		EmpolyeeClass empolyee2 = new EmpolyeeClass("Asif", "Ahmed", 30000);
		
		System.out.print(empolyee1);
		System.out.print("\n**************************************************\n");
		System.out.print(empolyee2);
	}
}