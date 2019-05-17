class Circle{
	private double radius;
	private String color;
	private final double PI=3.14;
	public Circle(){
		radius=1.0;
		color="Red";
	}
	public Circle(double r){
		radius=r;
	}
	public Circle(double r,String c){
		radius=r;
		color=c;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		radius=r;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color=c;
	}
	public double getArea(){
		return (PI*radius*radius);
	}
	public String toString(){
		return "Circle[radius= "+radius+", Color= "+color+"]";
	}
	public double getPI(){
		return PI;
	}

}