class Marksheet{
	private double calculus;
	private double english;
	private double islamiat; 
	public Marksheet(double calculus,double eng,double isl){
		this.calculus=calculus;
		english=eng;
		islamiat=isl;
	}
	public int getTotalMarks(){
		return 300;
	}
	public double getObtainedMarks(){
		return (calculus+english+islamiat);
	}
	public double getPercentage(){
		return ( ( (getObtainedMarks()/getTotalMarks())*100 ) );
	}
	public char getGrade(double percentage){
		char grade=0;
		if(percentage>=90){
			grade='A';
		}
		else if(percentage<90 && percentage>=80){
			grade='B';
		}
		else if(percentage<80 && percentage>=70){
			grade='C';
		}
		else if(percentage<70 && percentage>=60){
			grade='D';
		}
		return grade;
	} 
}