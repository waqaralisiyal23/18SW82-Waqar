import java.util.*;
class MyCalculator{
    long pow=1;
    public long power(int n,int p) throws Exception{
        if(n>0 && p>0){
            for(int i=1;i<=p;i++){
                pow*=n;
            }
            
        }
        else{
            //System.out.print("Else block");
            throw new Exception("n and p cannot be negative or 0");
        }
        return pow;
    }
    public static void main(String[]args)
    {
        int n=0;
        int p=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        n=sc.nextInt();
        System.out.print("Enter value for p: ");
        p=sc.nextInt();
        MyCalculator c = new MyCalculator();
        try{
            long pow = c.power(n,p);
            System.out.println(pow);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}