public class Zig_Zag {
public static void solve(int n,int m,int[][] arr){
    //write your code here
    for(int i=0;i<n;i++){
        if(i%2!=0)
             {
              for(int j=0;j<m;j++){
              System.out.print(arr[i][j]+" ");
            }
             }
            else{
                 for(int j=m-1;j>=0;j--){
                  System.out.print(arr[i][j]+" ");
            }
        }
        
       
    }
  }

  public static void main(String args[]){
    int n =5;
    int m = 5;

    int arr[][] = {{4, 7, 1 ,1 ,7},{8 ,9 ,9, 6,1},{6, 4 ,9, 5, 1},{7, 7, 4 ,7 ,7},{8, 6, 2 ,5 ,5}};

    solve(n,m,arr);
//     5 5
// 4 7 1 1 7
// 8 9 9 6 1
// 6 4 9 5 1
// 7 7 4 7 7
// 8 6 2 5 5
  }
}