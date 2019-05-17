public class MainClass{
	public static void main(String[]args)
	{
		Shape s=new Shape("Purple",true);
		System.out.println("Any Shape(not specified): "+s.toString());
		Circle c=new Circle(2.2,"Black",true);
		System.out.println(c.toString());
		System.out.println("Area of Circle: "+c.getArea());
		System.out.println("Perimeter of Circle: "+c.getPerimeter());
		Rectangle r=new Rectangle(3.4,2.5,"White",true);
		System.out.println(r.toString());
		System.out.println("Area of Rectangle: "+r.getArea());
		System.out.println("Perimeter of Rectangle: "+r.getPerimeter());
		Square sq=new Square(3.0,"Pink",true);
		System.out.println(sq.toString());
		System.out.println("Area of Square: "+sq.getArea());
		System.out.println("Perimeter of Square: "+sq.getPerimeter());
	}
}