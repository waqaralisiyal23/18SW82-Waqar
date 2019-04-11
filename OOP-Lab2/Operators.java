class Operators{
public static void main(String[]args)
{
	int a=5,b=7,c=5;
	System.out.println("a<b= "+ (a<b));
	System.out.println("a>c "+ (a>c));
	System.out.println("a<=b "+ (a<=b));
	System.out.println("b>=c "+ (b>=c));
	System.out.println("b==c "+ (b==c));
	System.out.println("a!=c "+ (a!=c));
	
	boolean x=true,y=false;
	System.out.println("x&y= "+ (x&y)); 
	System.out.println("x|y= "+ (x|y));
	System.out.println("!x= "+ (!x));
	System.out.println("!y= "+ (!y));
	System.out.println("x^y= "+ (x^y));
      
	if(a<10 && c==5)
	System.out.println("Sort circuit &&");
	if(a==5 || b>10)
	System.out.println("Sort circuit ||");
}
}