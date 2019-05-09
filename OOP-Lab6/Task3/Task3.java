class Overloading{
	private int n;
	private char ch;
	public void show(int n,char ch){
		this.n=n;
		this.ch=ch;
		System.out.println("Integer: "+n);
		System.out.println("Character: "+ch);
	}
	public void show(char ch,int n){
		this.n=n;
		this.ch=ch;
		System.out.println("Integer: "+n);
		System.out.println("Character: "+ch);
	}
}
public class Task3{
	public static void main(String[]args)
	{
		Overloading obj=new Overloading();
		obj.show(12,'a');
		obj.show('b',24); 
	}
}