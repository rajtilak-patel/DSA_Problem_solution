/*
 * inputs 
 * 3
 * 
 * outputs
 * 
1 
1 2 
1 2 3 
1 3 
2 
2 3 
3 
 * 
 */
import java.util.*;
public class Posible_all_compination{
    public static void print(List<Integer>output){
        for(int i=0;i<output.size();i++){
            System.out.print(output.get(i)+" ");
        }
        System.out.println();
    }
    public static void posibility(int arr[],int index,List<Integer>output){
        if(output.size()!=0){
            print(output);
        }
        
        if(index==arr.length){
            return;
        }
        for(int i=index;i<arr.length;i++){
             output.add(arr[i]);
             posibility(arr,i+1,output);
             output.remove(output.size()-1);
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        List<Integer> output = new ArrayList<>();
        for(int i=0;i<n;i++){
             arr1[i]=i+1;
        }
        System.out.println("");
        posibility(arr1,0,output);
       
    }
}