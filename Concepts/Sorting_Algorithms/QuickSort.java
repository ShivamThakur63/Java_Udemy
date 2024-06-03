package Concepts.Sorting_Algorithms;

public class QuickSort
{

    public static void main(String[] args) {
        int arr[] = {2,1,23,8,11,30,0,63,3,13};
        
        quickSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
       
    }

    public static int pivotCalc(int[] arr,int start,int end)
    {
        int pivot = arr[end];
        int i = start-1;

        for(int j =start;j<end;j++){
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }
    
    public static void quickSort(int[] arr,int start,int end)
    {
        

        if(start<end){
            int pivot = pivotCalc(arr, start, end);
            quickSort(arr,0,pivot-1);
            quickSort(arr,pivot+1,end);
        }
       
    }
}
