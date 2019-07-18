package genericsports;
class Sports{
    public String getName(){
        return "Generic Sports";
    }
    public void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in "+getName());
    }
}
class Cricket extends Sports{
    public String getName(){
        return "Cricket";
    }
    public void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in "+getName());
    }
}
class Soccer extends Sports{
    public String getName(){
        return "Soccer";
    }
    public void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in "+getName());
    }
}
public class Example{
    public static void main(String[]args)
    {
        Cricket c = new Cricket();
        Soccer s = new Soccer();
        System.out.println("Sports: "+c.getName());
        c.getNumberOfTeamMembers();
        System.out.println("Sports: "+s.getName());
        s.getNumberOfTeamMembers();
    }
}

