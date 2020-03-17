//3.13
public class EmpolyeeClass{
	private String FirstName;
	private String LastName;
	private double Salary;
	private double YSalary;
	
	public EmpolyeeClass(String fname, String lname, double salary){
		FirstName = fname;
		LastName = lname;
		
		if(Salary < 0)
			Salary = 0;
		else
			Salary = salary;
			YSalary = Salary;
	}
	
	public void setFname(String fname){FirstName = fname;}
	public void setLname(String lname){LastName = lname;}
	public void setSalary(double salary){Salary = salary;}
	
	public String getFname(){return FirstName;}
	public String getLname(){return LastName;}
	public double getSalary(){return Salary;}
	public double getYSalary() {return YSalary * 12;}
	public double getY10Salary() {return ((YSalary * 12) / 10) * 100 + (YSalary * 12);}
	
	public String toString(){
		return String.format("%nFirst name: %s %nLast name: %s %nSalary: %.3f %n%s's yearly salary: %.3f %n%s's yearly salary with 10%% raise: %.3f", FirstName, LastName, Salary, FirstName, getYSalary(), FirstName, getY10Salary());
	}
}