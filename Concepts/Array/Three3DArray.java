
package Concepts.Array;

/*

Three-Dimensional Array in C
A Three Dimensional Array or 3D array in C is a collection of two-dimensional arrays. It can be visualized as multiple 2D arrays stacked on top of each other.

Declaration of Three-Dimensional Array in C
We can declare a 3D array with x 2D arrays each having y rows and z columns using the syntax shown below.

Syntax:

data_type array_name[x][y][z];
data_type: Type of data to be stored in each element.
array_name: name of the array
x: Number of 2D arrays.
y: Number of rows in each 2D array.
z: Number of columns in each 2D array.
*/
public class Three3DArray {
    
    public static void main(String[] args) {
        int num[][][]=new int[2][2][4];

        //Another Way Of Initializing
        num[0][0]=new int[]{85,25,35,45};   
        num[0][1]=new int[]{10,20,30,40};
        num[1][0]=new int[]{50,60,70,80};
        num[1][1]=new int[]{90,25,65,15};

        //First 3D Array 1st Row
        num[0][0][0]=85;
        num[0][0][1]=25;
        num[0][0][2]=35;
        num[0][0][3]=45;


         //First 3D Array 2nd Row 
         num[0][1][0]=10;
         num[0][1][1]=20;
         num[0][1][2]=30;
         num[0][1][3]=40;
        

        
        //Second 3D Array 1st Row 
        num[1][0][0]=50;
        num[1][0][1]=60;
        num[1][0][2]=70;
        num[1][0][3]=80;
        

        //Second 3D Array 2nd Row
        num[1][1][0]=90;
        num[1][1][1]=25;
        num[1][1][2]=65;
        num[1][1][3]=15;
        

        //Using For Loop 
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    System.out.print(num[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("-".repeat(32));

        //Using For Each Loop 
        for(int[][] n :num){
            for(int[]m:n){
                for(int o:m){
                    System.out.print(o+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


        }
    }


    //Best Youtube Video Explanation : https://youtu.be/7HvFovZs-Jg?si=4ZQVlNZOb5E7sV0j
