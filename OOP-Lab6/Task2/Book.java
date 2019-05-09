class Book{
	private String name;
	private Author []authors;
	private double price;
	int qty;
	public Book(String name,Author []authors,double price){
		this.name=name;
		this.authors=authors;
		this.price=price;
	}
	public Book(String name,Author []authors,double price,int qty){
		this.name=name;
		this.authors=authors;
		this.price=price;
		this.qty=qty;	
	}
	public String getName(){
		return name;
	}
	public Author[] getAuthors(){
		return authors;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public int getQty(){
		return qty;
	}
	public void setQty(int qty){
		this.qty=qty;
	}
	public String toString(){
		String authorList="";
		for(int i=0; i<authors.length;i++){
			if(i==authors.length-1){
				authorList+=authors[i].toString();
			}
			else{
				authorList+=authors[i].toString()+",";
			}
		}
		return "Book[name: "+name+", "+authorList+", price: "+price+" and qty: "+qty+"]";
	}
	public String getAuthorNames(){
		String names="";
		for(int i=0;i<authors.length;i++){
			if(i==authors.length-1){
				names+=authors[i].getName();	
			}
			else{
				names+=authors[i].getName()+",";
			}
		}
		return names;
	}
}