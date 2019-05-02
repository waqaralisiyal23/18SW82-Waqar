class Student{
	private String name;
	private int age;
	private int rollNo;
	private String depart;
	private int batch;
	private String uni;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setData(int r,String depart,int batch,String uni){
		rollNo=r;
		this.depart=depart;
		this.batch=batch;
		this.uni=uni;
	}
	public void showData(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Roll No: "+batch+"SW"+rollNo);
		System.out.println("Department: "+depart);
		System.out.println("Batch: "+batch);
		System.out.println("University: "+uni);
	}
}