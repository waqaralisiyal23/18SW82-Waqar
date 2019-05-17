public class MainClass{
	public static void main(String[]args)
	{
		Person p1=new Person("Ahmed Ali Siyal","A-216, Gulsan-e-Hadeed, Phase-I, Karachi");
		System.out.println(p1.toString());
		Student s1=new Student("Waqar Ali Siyal","A-216, Gulsan-e-Hadeed, Phase-I, Karachi","Software Engineering",2018,3200);
		System.out.println(s1.toString());
		Staff st=new Staff("Abdul Nabi","A-216, Gulsan-e-Hadeed, Phase-I, Karachi","The Elonera School",15000);
		System.out.println(st.toString()); 
	}
}