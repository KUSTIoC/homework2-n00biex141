public class SavingAccountTest{
	public static int air;
	public static double sbr;
	
	public static void main(String[] args){
		SavingAccountClass SA1 = new SavingAccountClass(0);
		SA1.setSBR(2000.00);
		SA1.setAIR(4);
		
		SavingAccountClass SA2 = new SavingAccountClass(0);
		SA2.setSBR(3000.00);
		SA2.setAIR(5);
		
		System.out.print(SA1);
		System.out.print("\n*****************************************************\n");
		System.out.print(SA2);
		
	}
}