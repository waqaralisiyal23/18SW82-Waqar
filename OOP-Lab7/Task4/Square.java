class Square extends Rectangle{
	private double side;
	public Square(){
		side=1.0;
	}
	public Square(double s){
		side=s;
	}
	public Square(double s,String c,boolean f){
		//here super(c,f) cannot be used because it is present in shape class and its super class is
		// rectangle so super will call the constructor of rectangle class
		side=s;
		setColor(c);
		setFilled(f);
	}
	public double getSide(){
		return side;
	}
	public void setSide(double s){
		side=s;
	}
	//In task it is required to set and get width,length of Square but Square has only a one side 
	//therefore no need of length and width Square has all sides equal 
	public double getArea(){
		return (side*side);
	}
	public double getPerimeter(){
		return (4*side);
	}
	public String toString(){
		return "Square[Side= "+side+", Color: "+getColor()+"]";
	}
}