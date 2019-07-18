package sumoffactors;
import java.util.*;
interface AdvancedArithmetic{
    int sumOfFactors(int n);    
}
class MyCalculator implements AdvancedArithmetic{
    public int sumOfFactors(int n){
        int sum=0;
        if(n<=1000){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
        }
        else{
            System.out.println("n shoud be <=1000");
        }
        return sum;
    }
    public static void main(String[]args){
        MyCalculator obj = new MyCalculator();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=obj.sumOfFactors(num);
        if(num<=1000){
            System.out.println(sum);
        }


    }
}