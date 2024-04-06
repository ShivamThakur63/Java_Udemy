public class S06_64_Looping {
    public static void main(String[] args) {
        
    
    //While -->Continue Executing code Block Until The Loop Expression Becomes False
    //Do While -->Execute The Code Block Once,then continue executing until the loop condition becomes False

//Differences Among Them
    //For Loop Statement

    for(int i =1;i<=5;i++){  //In This We Initialize The Temporary Variable Inside The Loop 
        System.out.print(i+" , ");
    }
    System.out.println();
    //While Loop Statement  

    int j = 1; //We Initialized The Temporary value  Here
    while(true){   //It Will Be True Only If The Lower Condition Is Satisfied And Then It Will Be Executed
    if(j>5){   //Its A Condition To Cheak
        break;
    }
        System.out.print(j+" , ");
        j++; //Increment Condition
    }
    System.out.println();
    //Do While Condition 

    int k=1;
    boolean isReady=false;
    do{
        if(k>5){
            break;
        }
        System.out.print(k+" , ");
        k++;
        isReady=(k>0);

    }while(isReady);
    System.out.println();

    //Continue  Term 
    //The Continue Statement,in its simples form,will stop executing the current iteration of a block of code in a loop, and start a new iteration
    //Continue And Break Is Different In The Way That Break Statement Stops Iteration There But A Continue Statement Just Terminates That Value And Move On IN Loop 

    //Continue Statement 
    int number=0;
    while(number<50){
        number+=5;
        if(number%25==0){
            continue;
        }
        System.out.print(number+"_");
    }

    System.out.println();
    System.out.println("-".repeat(30));
    //For Each loop
    //Enhanced For Loop In Java

    int minlength=25;
    String artist[][]=new String[3][];
    artist[0]=new String[]{"Shivam","Puskar","Binayak","Akshay"};
    artist[1]=new String[]{"Olivia Rodrigo", "Rashmika","Kyliee Jenner","Sapna Chaudhary"};
    artist[2]=new String[]{"Playboy Carti","Arijit Singh","Central Cee","Anuv Jain"};

for(String[] count:artist){  //For Every String count in artist Array 
    for(String name:count){  //For Every String name Count in count 

    if(name.length()<minlength){
        int spaceToAdd = minlength-name.length();
        for(int g=1;g<spaceToAdd;g++){
            name+=" ";
        }
        System.out.print(name);
    }
        
    }
    System.out.println();
    
}
}

}