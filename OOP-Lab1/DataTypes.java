class DataTypes{
public static void main(String[]args)
{
	String name = "Waqar Ali Siyal";
	int totalMarks = 650;
	byte testMarks = 4;	
	short attendanceMarks = 10;
	float assignmentMarks = 4.5f;
	long examMarks = 483;
	float totalObtainedMarks = (testMarks+attendanceMarks+assignmentMarks+examMarks);
	double percentage = (totalObtainedMarks/totalMarks)*100;
	char grade = 'A';
	boolean pass;
	if(percentage>=50){
		pass = true ;
	}
	else {
		pass = false;
	}
	
	System.out.println("Name: "+ name);
	System.out.println("Total Marks: "+ totalMarks);
	System.out.println("Test Marks: "+ testMarks);
	System.out.println("Attendance Marks: "+ attendanceMarks);
	System.out.println("Assignment Marks: "+ assignmentMarks);
	System.out.println("Exam Marks: "+ examMarks);
	System.out.println("Total Obtained Marks: "+ totalObtainedMarks);
	if(pass==true){
		System.out.println("Status: Pass");
	}
	else {
		System.out.println("Status: Fail");
	}
	System.out.println("Percentage: "+ percentage);
	System.out.println("Grade: "+ grade); 	
}
}