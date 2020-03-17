//8.6
public class SavingAccountClass {
    private static int AIR;
    private double SBR;

    public SavingAccountClass(double sbr) { SBR = sbr;}
	
	public void setSBR(double sbr) {SBR = sbr;}
    public static void setAIR(int air){SavingAccountClass.AIR = air;}
	
    
    public double setMIR()
    {
        SBR =((getSBR() * getAIR()) / 12 ) + SBR;
        return ((getSBR() * getAIR()) / 12);
    }
	
	public double getSBR() {return SBR;}	
	public static int getAIR() {return AIR;}
   
    public String toString(){
		return String.format("Saving Balance: %.3f %nMonthly Interest Rate: %.3f %nNew Saving Balance: %.3f", getSBR(), setMIR(), getSBR());
    }
    
}