public class UseStudentClass{
	public static void main(String[]args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student s7=new Student();
		Student s8=new Student();
		Student s9=new Student();
		Student s10=new Student();
		s1.setInfo("Waqar Ali Siyal",19,"A-216,Gulshan-e-Hadeed,Phase-1,Karachi");
		s2.setInfo("Ahmed Ali Keeriyo",18,"A-23,Gulshan-e-Hadeed,Phase-1,Karachi");
		s3.setInfo("Usama Sheikh",19,"B-100,Gulshan-e-Hadeed,Phase-1,Karachi");
		s4.setInfo("Imtiaz Ahmed",18,"C-207,Gulshan-e-Hadeed,Phase-1,Karachi");
		s5.setInfo("Uzair Ahmed",18,"B-12,Gulshan-e-Hadeed,Phase-1,Karachi");
		s6.setInfo("Ahmed Ali Siyal",20,"B-52,Gulshan-e-Hadeed,Phase-1,Karachi");
		s7.setInfo("Muskan Thaheem",17,"C-53,Gulshan-e-Hadeed,Phase-1,Karachi");
		s8.setInfo("Abdul Nabi",10,"A-218,Gulshan-e-Hadeed,Phase-1,Karachi");
		s9.setInfo("Ayesha",12,"B-19,Gulshan-e-Hadeed,Phase-1,Karachi");
		s10.setInfo("Walliya",11,"C-20,Gulshan-e-Hadeed,Phase-1,Karachi");
		Student []std={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		int j=0; //extra just to show student number
		for(int i=0;i<std.length;i++){
			System.out.println("\tStudent: "+ (++j));
			std[i].showInfo();
		}
	}
}