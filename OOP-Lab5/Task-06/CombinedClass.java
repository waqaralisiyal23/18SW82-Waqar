class CombinedClass{
	Student s;
	Marksheet m;
	public CombinedClass(Student s,Marksheet m){
		this.s=s;
		this.m=m;
	}
	public void createStudentResult(){
		s.showData();
		System.out.println("Total Marks= "+m.getTotalMarks());
		System.out.println("Obtained Marks= "+m.getObtainedMarks());
		System.out.println("Percentage= "+m.getPercentage());
		if( m.getGrade(m.getPercentage())!=0 ){
		System.out.println("Grade: "+ m.getGrade(m.getPercentage()) );
		}
		else{
			System.out.println("Grade: Fail");
		}
	}
}