//3.12
public class InvoiceClass{
	private String PartNumber;
	private String PartDescription;
	private int QuantityItem;
	private double PpIteam;
	
	public InvoiceClass(String partnumber, String partdesctiption, int quantityitem, double ppiteam){
		PartNumber = partnumber;
		PartDescription = partdesctiption;
		
		if(quantityitem < 0)
			QuantityItem = 0;
		else
			QuantityItem = quantityitem;
		
		if(ppiteam < 0)
			ppiteam = 0.0;
		else
			PpIteam = ppiteam;
	}
	
	public void setPartNumber(String partnumber){
		PartNumber = partnumber;
	}
	public void setPartDescription(String partdesctiption){
		PartDescription = partdesctiption;
}
	public void setQuantityItem(int quantityitem){
		if(quantityitem < 0)
			QuantityItem = 0;
		else
			QuantityItem = quantityitem;
	}
	public void setPartNumber(double ppiteam){
		if(ppiteam < 0)
			ppiteam = 0.0;
		else
			PpIteam = ppiteam;
	}
	public String getPartNumber(){return PartNumber;}
	public String getPartDescription(){return PartDescription;}
	public int getQuantityItem(){return QuantityItem;}
	public double getPpItem(){return PpIteam;}
	
	public String toString(){
		return String.format("%nPart Number: %s %nPart Description: %s %nQuantity of Item: %d %nPrice per Item: %.3f", PartNumber, PartDescription, QuantityItem, PpIteam);
	}
}