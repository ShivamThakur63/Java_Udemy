


record BaseballPlayer(String name, String position){}


public class Main {
    

    public static void main(String[] args) {
    
        BaseballTeam phillies = new BaseballTeam("Philiadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Huston Astros");
        scoreResult(phillies, 3, astros, 5);

        System.out.println();

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMembers(harper);
        phillies.addTeamMembers(marsh);
        phillies.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1 , int t1_score , BaseballTeam team2 , int t2_score)
    {
        String message  = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s ",team1,message,team2);
    }

}
