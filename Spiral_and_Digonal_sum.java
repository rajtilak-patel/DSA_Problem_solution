

import java.util.*;
public class Spiral_and_Digonal_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int sum = 0;
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            int row = 0;
            int col=0;
            
            for(int i=0;i<n;i++){
                if(i%2==0){
                    while(col<n-i/2){
                        arr[row][col]= sc.nextInt();
                        col++;
                    }
                    col--;
                    row++;
                    
                     while(row<n-i/2){
                        arr[row][col]= sc.nextInt();
                        row++;
                    }
                    col--;
                    row--;
                }
                else{
                    while(col>=i/2){
                        arr[row][col] = sc.nextInt();
                        col--;
                    }
                    col++;
                    row--;
                    while(row>=1+i/2){
                        arr[row][col] = sc.nextInt();
                        row--;
                    }
                    row++;
                    col++;
                    
                }
            }
            for(int i=0; i<n; i++){
                sum += arr[i][i];
                sum += arr[i][n-1-i];
            }
            if(n%2==1){
                sum -= arr[n/2][n/2];
            }
            System.out.println(sum);
            test--;
        }
    }
}