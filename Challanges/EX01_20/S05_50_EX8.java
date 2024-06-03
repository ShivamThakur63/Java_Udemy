package EX01_20;

public class S05_50_EX8 {
    
        public static boolean hasTeen(int Age1,int Age2,int Age3){
            if((Age1>=13&&Age1<=19)||(Age2>=13&&Age2<=19)||(Age3>=13&&Age3<=19)){
                return true;
            }
            return false;
        }
        public static boolean isTeen(int Age4){
            if(Age4>=13&&Age4<=19){
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            System.out.println(hasTeen(31, 6, 87));
        }
    }

