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
}