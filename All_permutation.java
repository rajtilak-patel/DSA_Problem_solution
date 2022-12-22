
import java.util.*;
public class All_permutation{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int idx){
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
    }
    
    public static void printPermutation(int arr[],int idx){
        if(idx == arr.length-1){
            printArray(arr);
            return;
        }
        for(int i=idx; i<arr.length;i++){
            swap(arr,i,idx);
            printPermutation(arr,idx+1);
            swap(arr,i,idx);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printPermutation(arr,0);
    }
}