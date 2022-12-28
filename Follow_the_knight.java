/*
 * input
 * 3 3 1
 * 
 * output
 * 8
 */
import java.util.*;
public class Follow_the_knight{
    public static int[][] followTheNight(int board[][],int row,int col,int n){
       // int count = 0;
        
        if(row>=0 && row<board.length && col>=0 && col<board.length && n>=0){
            if(n==0){
                board[row][col] = 1;
                return board;
            }
            followTheNight(board, row+1, col+2, n-1);
            followTheNight(board,row-1,col+2,n-1);
            followTheNight(board,row+1,col-2,n-1);
            followTheNight(board,row-1,col-2,n-1);
            followTheNight(board,row+2,col-1,n-1);
            followTheNight(board,row+2,col+1,n-1);
            followTheNight(board,row-2,col-1,n-1);
            followTheNight(board,row-2,col+1,n-1);
        }
        return board;
    }
    
    
    public static int count(int board[][]){
        int count = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(board[i][j]==1){
                    count++;
                }
            }
        }
        return count;
            
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int n = sc.nextInt();
        int board[][] = new int[10][10];
        for(int i=0; i<10; i++)
            for(int j=0; j<10; j++)
                board[i][j] = 0;
        //board[row-1][col-1] = 1;
        board = followTheNight(board,row-1,col-1,n);
        System.out.println(count(board));
        
    }
}