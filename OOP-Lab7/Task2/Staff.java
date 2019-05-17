class Staff extends Person{
	private String school;
	private double pay;
	Staff(String n,String a,String s,double p){
		super(n,a);
		school=s;
		pay=p;
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String s){
		school=s;
	}
	public double getPay(){
		return pay;
	}
	public void setPay(double p){
		pay=p;
	}
	public String toString(){
		return "Staff[Person[Name: "+getName()+", Address: "+getAddress()+"], School: "+school+", Pay: "+pay+"]";
	}
}