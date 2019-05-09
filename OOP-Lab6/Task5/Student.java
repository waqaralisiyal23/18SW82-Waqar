class Student{
	private String name;
	private int age;
	private String address;
	public Student(){
		name="unknown";
		age=0;
		address="Not Available";
	}
	public void setInfo(String n,int a){
		name=n;
		age=a;
	}
	public void setInfo(String n,int a,String address){
		name=n;
		age=a;
		this.address=address;
	}
	public void showInfo(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address"+address);
	}
}