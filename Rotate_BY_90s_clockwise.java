// inputs 
// 2
// 4
// 1 2 3 4
// 5 6 7 8
// 1 2 3 4
// 5 6 7 8
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// outputs
// 5 1 5 1 
// 6 2 6 2 
// 7 3 7 3 
// 8 4 8 4 
// 7 4 1 
// 8 5 2 
// 9 6 3

import java.util.*;
public class Rotate_BY_90s_clockwise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        while(test-->0){
            int n = sc.nextInt();
            
            int arr[][] = new int[n][n];
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            for(int i=0;i<n;i++){
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}
