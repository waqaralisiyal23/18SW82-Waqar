import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}
class VotingMachine{
    String []candidates;
    int []count;
    int selection;
    public void addCandidates(String []s){
        candidates=s;
        count = new int[s.length];
    }
    public void castVote(int age) throws InvalidAgeException{
        if(age>=18){
            System.out.println("Select candidate to Vote: ");
            for(int i=0;i<candidates.length;i++){
                System.out.println((i+1)+") "+candidates[i]);
            }
            Scanner sc = new Scanner(System.in);
            selection=sc.nextInt();
            for(int i=0;i<candidates.length;i++){
                if(selection==(i+1)){
                    count[i]++;
                }
            }
        }
        if(age<18){
            throw new InvalidAgeException("Invalid Age");
        }
    }
    public void printResult(){
        for(int i=0;i<candidates.length;i++){
            System.out.println("Votes Casted for "+candidates[i]+" are "+count[i]+".");
        }
    }
    public static void main(String[]args){
        InvalidAgeException e = new InvalidAgeException("Invalid Age");
        VotingMachine v = new VotingMachine();
        String []names={"Waqar","Uzair","Mudassir","Usama","Imtiaz"};
        v.addCandidates(names);
        try{
            v.castVote(18);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(20);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(17);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(20);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(52);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(25);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(31);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(38);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(18);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        v.printResult();
    }
}