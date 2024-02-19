public class S05_56_EX12 {
    // write code here
    public static boolean isCatPlaying(boolean summer ,int temperature){
       if(summer==true){
           if(temperature>=25&&temperature<=45){
               return true;
           }
           return false;
       }else{
           if(temperature>=25&&temperature<=35){
               return true;
           }
           return false;
       }
    }

 
    // public static boolean isCatPlaying(boolean summer, int temperature) {
        
    //     int max = summer ? 45 : 35;
    //     return temperature >= 25 && temperature <= max;
    // }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 32));
        System.out.println(isCatPlaying(true, 36));
        System.out.println(isCatPlaying(false, 48));
        System.out.println(isCatPlaying(true, 44));
    }
}