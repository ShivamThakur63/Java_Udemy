
public class S05_48_Methods {
    public static void displayHighScorePosition(String Player_Name,int Player_Position){
    
        System.out.println(Player_Name + " managed to get into position "+Player_Position+" on the high Score List");

    }
    public static int calculateHighScorePosition(int Player_Score) {
        
        //One Way

       /*  if(Player_Score>=1000){
            return 1;
        }else if (Player_Score>=500 && Player_Score<1000) {
            return 2;
        }else if (Player_Score>=100 && Player_Score<500){
            return 3;
        }else {
            return 4;
        }
        */

        // Next Way

        /*if(Player_Score>=1000){
            return 1;
        }else if(Player_Score>=500){
            return 2;
        }else if (Player_Score>=100){
            return 3;
        } 
        return 4;
    } 
        */

        //Other Way

        int Player_Position = 4;
        if(Player_Score>=1000){
            Player_Position = 1;
        }else if(Player_Score>=500){
            Player_Position= 2;
        }else if (Player_Score>=100){
            Player_Position= 3;
        } 
        return Player_Position;

    }
    public static void main(String[] args) {
         int Player_Position = calculateHighScorePosition(500);
         displayHighScorePosition("Tim", Player_Position);

        Player_Position =calculateHighScorePosition(1000);
        displayHighScorePosition("Saroj", Player_Position);

        Player_Position = calculateHighScorePosition(25);
        displayHighScorePosition("Pushkar", Player_Position);

        Player_Position = calculateHighScorePosition(200);
        displayHighScorePosition("Shivam", Player_Position);
    
}
}