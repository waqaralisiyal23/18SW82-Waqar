class Circle extends Shape{
	private double radius;
	private final double PI=3.14;
	public Circle(){
		radius=1.0;
	}
	public Circle(double r){
		radius=r;
	}
	public Circle(double r,String c,boolean f){
		super(c,f);
		radius=r;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		radius=r;
	}
	public double getArea(){
		return (PI*radius*radius);
	}
	public double getPerimeter(){
		return (2*PI*radius);
	}
	public String toString(){
		return "Circle[Color: "+getColor()+", Radius= "+getRadius()+"]";
	}
}class Rectangle extends Shape{
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
		super(c,f); //super() will always be the first line
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