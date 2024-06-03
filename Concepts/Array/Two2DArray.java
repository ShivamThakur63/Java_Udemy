
package Concepts.Array;

import java.util.Arrays;

public class Two2DArray {
    public static void main(String[] args) {
        
    //2D Array Initialization 
    int nums [][] = new int [2][3];

    //Filling All the Details In the Array 
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
             nums[i][j]=(int)(Math.random()*100);
        }
    }

    System.out.println("-".repeat(32));
    
    //For Printing The Values of The Arrays Accordingly 
    for(int i=0;i<2;i++){                                   //For Rows 
        for(int j=0;j<3;j++){                               //For Columns
            if(nums[i][j]<10){                              //If Condition For Good Representation Of Arrays
                System.out.print("0"+nums[i][j]+" ");
            }else{
            System.out.print(nums[i][j]+" ");
        }
    }
        System.out.println();                               //To Print Next Row In Different Line
    }
    System.out.println("-".repeat(32));

    //Using The For Each Loop 
    for(int[] n:nums){
        for(int m:n){
        System.out.print(m+" ");
    }
    System.out.println();
}
    System.out.println("-".repeat(32));
    System.out.println(Arrays.deepToString(nums));
}
}
