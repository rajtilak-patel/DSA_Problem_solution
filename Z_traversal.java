public class Z_traversal {
    
public static void zTraversal(int N, int matrix[][]){
    //write your code here
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(i==0 || i==N-1 || i+j==N-1){
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
     System.out.println();
  }

  public static void main(String args[]){
    int test = 1;
    int n = 3;
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

    zTraversal(n,arr);

    // 1
    // 3
    // 1 2 3
    // 4 5 6
    // 7 8 9
  }
}