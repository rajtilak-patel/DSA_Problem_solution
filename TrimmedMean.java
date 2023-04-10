// inputs 
// 1 
// 1 
// 10 100 20 30 50;
// output - 33
import java.util.*;
public class TrimmedMean{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            int arr[] = new int[n*5];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
             
            // System.out.println();
            int sum = 0;
            for(int i=n;i<arr.length-n;i++){
                sum += arr[i];
            }
            // System.out.println(sum);
            int ans = sum/(n*5-n*2);
            System.out.println(ans);
        }
    }
}