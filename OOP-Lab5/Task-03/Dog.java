class Dog{
	private String name;
	private int age;
	private String breed;
	public void setDetails(String name,int age,String breed){
		this.name=name;
		this.age=age;
		this.breed=breed;
	}
	public void showDetails(){
		if(name!=null && breed!=null && age!=0){       //age has by default 0 therefore considering that 
			System.out.println("Name: "+name); // if age!=0 then the age of dog is not set.
			System.out.println("Age: "+age);
			System.out.println("Breed: "+breed);
		}
		else{
			System.out.println("Details are unavailable.");
		}
	}
}