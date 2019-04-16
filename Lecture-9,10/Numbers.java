class Numbers{
	public static void main(String[]args)
	{
		System.out.println("\t\tUsing For Loop");
		System.out.println("Odd Numbers");
		for(int n=0;n<=30;n++){
			if(n%2!=0){
				System.out.print(n+" ");
			}
		}
		System.out.println("\nEven Numbers");
		for(int n=0;n<=30;n++){
			if(n%2==0){
				System.out.print(n+" ");
			}
		}

		System.out.println("\n\t\tUsing While Loop");
		System.out.println("Odd Numbers");
		int n=0;
		while(n<=30){
			if(n%2!=0){
			System.out.print(n+" ");
			}
			n++;
		}
		System.out.println("\nEven Numbers");
		n=0;
		while(n<=30){
			if(n%2==0){
			System.out.print(n+" ");
			}
			n++;
		}
	}
}