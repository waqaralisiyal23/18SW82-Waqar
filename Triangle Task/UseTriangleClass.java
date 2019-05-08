public class UseTriangleClass{
	public static void main(String[]args)
	{
		Triangle t=new Triangle();
		System.out.println("Hypotenuse= "+t.getHyp(10,30));
		System.out.println("Perpendicular= "+t.getPerp(8,2));
		System.out.println("Base= "+t.getBase(8,4));
	}
} 