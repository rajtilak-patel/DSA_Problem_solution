
import java.util.*;
public class Rotate_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            k = k%n;
            
            for(int i=0;i<n;i++){
                if(i<k){
                    System.out.print(arr[n+i-k]+" ");
                }
                else{
                    System.out.print(arr[i-k]+" ");
                }
            }
            System.out.println();
        }
    }
}