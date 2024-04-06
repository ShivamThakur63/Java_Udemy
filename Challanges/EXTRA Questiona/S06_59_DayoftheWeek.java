public class S06_59_DayoftheWeek {
    public static void printDayofWeek(int day){

        //Switch Case
        String dayofWeek=switch(day){
            case 0 ->"Sunday";
            case 1 ->"Monday";
            case 2 ->"Teusday";
            case 3 ->"Wednesday";
            case 4 ->"Thrusday";
            case 5 ->"Friday";
            case 6 ->"Saturday";
            default ->"Not A Valid Day ";
        };
        System.out.println(day + " stands for "+dayofWeek);
    }

    //If else Case 
    public static void printWeekDay(int day){

        String dayofWeek = "Invalid Day";

        if(day==0)
        {
            dayofWeek="Sunday";
        }else if(day==1){
            dayofWeek="Monday";
        }else if(day==2){
            dayofWeek="Tuesday";
        }else if(day==3){
            dayofWeek="Wednesday";
        }else if(day==4){
            dayofWeek="Thrusday";
        }else if(day==5){
            dayofWeek="Friday";
        }else if(day==6){
            dayofWeek="Saturday";
        }
        System.out.println(day+" Stands For "+ dayofWeek);
    }
    public static void main(String[] args) {
        printDayofWeek(0);
        printDayofWeek(1);
        printDayofWeek(2);
        printDayofWeek(3);
        printDayofWeek(4);
        printDayofWeek(5);
        printDayofWeek(6);
        printDayofWeek(7);
    }
    
}
