
// function spirallyTraversingAMatrix(N, matrix){
//     //write code here
// 1 2 3 4 8 4 8 7 6 5 1 5 6 7 3 2 
  
// }
import java.util.*;
public class Spirally_travers_matrix{
    public static void traverse(int arr[][],int n){
         int minR = 0,minC = 0;
        int maxR = arr.length-1;
        int maxC = arr[0].length-1;
        int count = 0;
        int totalCount = n*n;
        while(count<totalCount){
            for(int i=minR,j=minC;j<=maxC && count<totalCount;j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minR++;
             for(int i=minR,j=maxC;i<=maxR && count<totalCount;i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxC--;
             for(int i=maxR,j=maxC;j>=minC && count<totalCount;j--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            maxR--;
             for(int i=maxR,j=minC;i>=minR && count<totalCount;i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minC++;
      }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        traverse(arr,n);
       
    }
 
}