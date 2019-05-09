class Author{
	private String name;
	private char gender;
	private String email;
	public Author(String name,char gender,String email){
		this.name=name;
		this.gender=gender;
		this.email=email;
	}
	public String getName(){
		return name;
	}
	public char getGender(){
		return gender;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String toString(){
		return "Author[name: "+name+", Gender: "+gender+" and E-mail: "+email+"]";
	} 
}