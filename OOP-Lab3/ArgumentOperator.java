public class ArgumentOperator{
	public static void main(String[]args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String c=args[2];
		if(c.equals("+")){
			System.out.println("Addition= "+ (a+b));
		}
		else if(c.equals("-")){
			System.out.println("Subtraction= "+ (a-b));
		}
		else if(c.equals("*")){
			System.out.println("Multiplication= "+ (a*b));
		}
		else if(c.equals("/")){
			System.out.println("Division= "+ (a/b));
		}
	}
}