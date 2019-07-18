package finalkeyword;
class Example{
    public final void message(){ //now no function can override this function 
        System.out.println("Function cannot be overridden by any function if the function is final");
    }
}
class Example1 extends Example{
    //Now this class cannot override the method present in parent class
    public static void main(String[]args){
        Example1 obj = new Example1();
        obj.message();
    }
}