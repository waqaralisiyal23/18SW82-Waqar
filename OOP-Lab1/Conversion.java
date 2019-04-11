class Conversion{
public static void main(String[]args)
{
 	double a=50.25;
	long b=(long)50.25;
	double c=a-b;
	System.out.println("Actual Number: "+ a);
	System.out.println("Integral Part: "+ b);
	System.out.println("Fractional Part: "+ c);
}
}