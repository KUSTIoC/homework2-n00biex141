//8.4
public class RectangleClass{
    private double Width;
	private double Length;

    public RectangleClass(double width, double length) {
		//For Width
        if(width<=0 && width>=20)
            Width = 0;
        else 
			Width = width;
		
		//For Length
		if(length<=0 && length>=20)
           Length = 0;
        else 
            Length = length; 
    }
	
	public void setWidth(double width) {
        if(width<=0 && width>=20)
            Width = 0;
        else 
			Width = width;
    }
	
	public void setLength(double length){
        if(length<=0 && length>=20)
           Length = 0;
        else 
            Length = length;
    }
	
    public double getWidth(){
        return Width;
    }    

    public double getLength(){
        return Length;
    }

    public double getPerimeter(){
        return ((Length + Width) * 2);
    }
	
    public double getArea(){
        return Length * Width;
    }

    public String toString(){
        return String.format("The Width of the rectangle is: %.3f %nThe Length of rectangle is: %.3f %nThe Area of the rectangle is: %.3f %nThe Perimeter of rectangle is: %.3f", Width, Length, getArea(), getPerimeter());
    }
}