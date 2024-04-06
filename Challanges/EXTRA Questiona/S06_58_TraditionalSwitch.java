public class S06_58_TraditionalSwitch {

    public static String SwitchChallange(char letter){

        //Incase Of Void Just replace the Return Statement With Print And Something Else And Add A Break Statement
        switch(letter){
            case 'A':
            return "Able";
            case 'B':
            return "Baker";
            case 'C':
            return "Charlie";
            case 'D':
            return "Dog";
            case 'E':
            return "Easy";

            // For Example :
            // case 'F' :
            // System.out.println(Fabulous);
            // break;
            
            default : 
                return "Letter "+letter+" not found";
            
        }
    }

    public static void main(String[] args) {
        char letter = 'A';
        System.out.println(SwitchChallange(letter));
    }
}