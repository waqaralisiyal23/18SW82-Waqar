class Student extends Person{
	private String program;
	private int year;
	private double fee;
	public Student(String n,String a,String p,int y,double f){
		super(n,a);
		program=p;
		year=y;
		fee=f;
	}
	public String getProgram(){
		return program;
	}
	public void setProgram(String p){
		program=p;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int y){
		year=y;
	}
	public double getFee(){
		return fee;
	}
	public void setFee(double f){
		fee=f;
	}
	public String toString(){
		return "Student[Person[Name: "+getName()+", Address: "+getAddress()+"], Program: "+
			   program+", Year: "+year+", Fee: "+fee+"]";
	}
}