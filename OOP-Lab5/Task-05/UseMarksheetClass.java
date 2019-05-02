public class UseMarksheetClass{
	public static void main(String[]args)
	{
		Marksheet m=new Marksheet(23,4.5,3.2);
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