// Inputs
// 1
// 5
// 1 3 2 4 5


// Hint

// In Sample 1:

// T = 1, N = 5

// 1 + 3 = 4 which is also present in the array ,
//  So output is 1



import java.util.*;
public class Triplet_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            
            int arr[] = new int[n];
            
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            for(int i=0;i<n-1;i++){
                int sum = arr[i]+arr[i+1];
                for(int j=0;j<n;j++){
                    if(sum==arr[j]){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}