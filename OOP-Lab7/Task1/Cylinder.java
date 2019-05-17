class Cylinder extends Circle{
	private double height;
	public Cylinder(){
		height=1.0;
	}
	public Cylinder(double r){
		setRadius(r);
	}
	public Cylinder(double r,double h){
		super(r); // setRadius(r);
		height=h;
	}
	public Cylinder(double r,double h,String c){
		setRadius(r);
		height=h;
		setColor(c);
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double h){
		height=h;
	}
	public double getVolume(){
		return (getPI()*getRadius()*getRadius()*height);
	}
}
