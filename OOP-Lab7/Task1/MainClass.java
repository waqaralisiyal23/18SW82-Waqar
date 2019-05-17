public class MainClass{
	public static void main(String[]args)
	{
		Circle circle1=new Circle(2.2,"Blue");
		System.out.println("Area Of Circle= "+circle1.getArea());
		System.out.println(circle1.toString());
		Cylinder c1=new Cylinder(2.4,1.7,"Yellow");
		System.out.println("Volume Of Cylinder= "+c1.getVolume());
	}
}