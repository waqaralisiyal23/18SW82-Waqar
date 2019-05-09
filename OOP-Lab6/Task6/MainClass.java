class Task6{
	static String name;
	static String gender;
	static{
		name="Waqar Ali Siyal";
	}
}
public class MainClass{
	public static void main(String[]args)
	{
		Task6.gender="Male";
		System.out.println("Name: "+Task6.name);
		System.out.println("Gender: "+Task6.gender);
	} 
}