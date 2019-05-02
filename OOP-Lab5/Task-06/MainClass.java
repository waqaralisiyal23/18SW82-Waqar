public class MainClass{
	public static void main(String[]args)
	{
		Student s=new Student("Waqar Ali Siyal",19);
		Marksheet m=new Marksheet(2.2,3,4.9);
		s.setData(82,"Software",18,"MUET");
		CombinedClass cc=new CombinedClass(s,m);
		cc.createStudentResult();
	}
}