class Rectangle extends Shape{
	private double width;
	private double length;
	public Rectangle(){
		width=1.0;
		length=1.0;
	}
	public Rectangle(double w,double l){
		width=w;
		length=l;
	}
	public Rectangle(double w,double l,String c,boolean f){
		setColor(c); 
		setFilled(f);
		width=w;
		length=l;
	} 
	public double getWidth(){
		return width;
	}
	public void setWidth(double w){
		width=w;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double l){
		length=l;
	}
	public double getArea(){
		return (length*width);
	}
	public double getPerimeter(){
		return (2*(length+width));
	}
	public String toString(){
		return "Rectangle[Width= "+width+", Length= "+length+", Color= "+getColor()+"]";
	}
}