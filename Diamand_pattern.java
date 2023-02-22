
public class Diamand_pattern
{
    public static void piramind(int n){
        int i, j, row = n;       
         
            for (i=0; i<row; i++)   
            {  
                for (j=row-i; j>1; j--)   
                {  
                //prints space between two stars  
                System.out.print(" ");   
                }   
           
                for (j=0; j<=i; j++ )   
                {   
                 
                   System.out.print("* ");   
                }   
            System.out.println();   
            }   
          }   
    
	public static void main(String[] args) {
	      int n=5;
	      
	      piramind(n);
	}
}