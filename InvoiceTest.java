//3.12
public class InvoiceTest{
	public static String pnumber;
	public static String pdescription;
	public static int qiteam;
	public static int ppiteam;
	
	public static void main(String[] args){		
		InvoiceClass invoice = new InvoiceClass("123", "Tool1", 23, -12);
		System.out.print(invoice);
	}
}