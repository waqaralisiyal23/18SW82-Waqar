public class MainClass{
	public static void main(String[]args)
	{
		System.out.println("\t\t\tStudent Info");
		Undergraduate u=new Undergraduate();
		u.setName("Waqar Ali Siyal");
		u.setAge(19);
		u.setRollNo(82);
		u.setDepart("Software Engineering");
		System.out.println("Name: "+ u.getName());
		System.out.println("Age: "+ u.getAge());
		System.out.println("Roll No: 18SW"+ u.getRollNo());
		System.out.println("Department: "+ u.getDepart());
		System.out.println("\n\t\t\tEmployee Info");
		Faculty f=new Faculty();
		f.setName("Ahmed Ali Siyal");
		f.setAge(23);
		f.setEmpIdNo(24102652);
		f.setDesignation("Client Executive");
		System.out.println("Name: "+ f.getName());
		System.out.println("Age: "+ f.getAge());
		System.out.println("Employee id: "+ f.getEmpIdNo());
		System.out.println("Designation: "+ f.getDesignation());
	}
}