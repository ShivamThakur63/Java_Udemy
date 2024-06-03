package Concepts.Sorting_Algorithms;
public class Selection{
    public static void main(String[] args) {
        int arr[] = {2,1,6,3,8,7,0};
        int l= arr.length;
        int min = 0 ;
        int temp = 0 ;
        for(int i = 0 ; i < l-1; i++){
            min = i;
            for(int j = i+1 ; j<l;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }
        for(int i = 0 ;i < l;i++){
            System.out.print(arr[i]);
        }
        
    }
}
