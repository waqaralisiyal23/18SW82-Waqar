public class Task7{
	public static void main(String[]args)
	{
		String s="Ali, 18, BE-Software;Aisha, 19, BE-Electronics";
		//split function return value in array
		String []str=s.split(";");
		str[0]="Ali, 18, BE-Software";
		str[1]="Aisha, 19, BE-Electronics";
		String str1[]=str[0].split(",");
		String str2[]=str[1].split(",");
		System.out.println("Student: 1");
		System.out.println("Name: "+str1[0]);
		System.out.println("Age: "+str1[1]);
		System.out.println("Program"+str1[2]);
		System.out.println("Student: 2");
		System.out.println("Name: "+str2[0]);
		System.out.println("Age: "+str2[1]);
		System.out.println("Program: "+str2[2]);
	}
}