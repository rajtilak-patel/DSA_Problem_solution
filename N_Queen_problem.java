
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class N_Queen_problem{
    public static int[][] board(int n){
        int[][] myBoard = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                myBoard[i][j] = 0;
            }
        }
        return myBoard;
    }
    /*public static void println(boolean n){
        System.out.println(n);
    }*/
    public static void println(int n){
        System.out.println(n);
    }
    /*public static void print(int[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        } 
    }*/
    
    public static boolean cross(int[][] board, int i, int j){
        boolean flag = true;
        int n = board.length;
        for(int x=0; x<n; x++){
            if(board[i][x]==1 || board[x][j]==1){
                flag = false;
                break;
            }
        }
        for(int x=0; x<n; x++){
            if((i-x)>=0 && (j-x)>=0 && flag){
                if(board[i-x][j-x]==1){
                    flag = false;
                    break;
                }
            }else{
                break;
            }
        }
        for(int x=0; x<n; x++){
            if((i+x)<n && (j+x)<n && flag){
                if(board[i+x][j+x]==1){
                    flag = false;
                    break;
                }
            }else{
                break;
            }
        }
        for(int x=0; x<n; x++){
            if((i-x)>=0 && (j+x)<n && flag){
                if(board[i-x][j+x]==1){
                    flag = false;
                    break;
                }
            }else{
                break;
            }
        }
        for(int x=0; x<n; x++){
            if((i+x)<n && (j-x)>=0 && flag){
                if(board[i+x][j-x]==1){
                    flag = false;
                    break;
                }
            }else{
                break;
            }
        }
        return flag;
    }
    public static int nQueen(int[][] myBoard, int n, int i, int j){
        int count = 0;
        int x = i;
        int y = j;
        if(n>0){
            while(i<myBoard.length){
                while(j<myBoard.length){
                    if(cross(myBoard, i, j)){
                        myBoard[i][j] = 1;
                        count += nQueen(myBoard, n-1, i+1, 0);
                        myBoard[i][j] = 0;
                    }
                    j++;
                }
                i++;
            }
        }
        if(n==0){
            return count+1;
        }
        return count;
    }
    public static void main(String[] args){
       
        int num = 8;
        int[][] myBoard = board(num);
        println(nQueen(myBoard, num, 0, 0));
    }
}