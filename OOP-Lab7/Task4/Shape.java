abstract class Shape{
	private String color;
	private boolean filled;
	public Shape(){
		color="Red";
		filled=true;
	}
	public Shape(String c,boolean f){
		color=c;
		filled=f;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color=c;
	}
	public boolean isFilled(){
		if(color!=null){
			return true;
		}
		else {
			return false;
		}
	}
	public void setFilled(boolean f){
		filled=f;
	}
	//we cannot make toString() method because we cannot make object of this class
	abstract public double getArea();
	abstract public double getPerimeter();
}