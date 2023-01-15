public class Star_Pattern{
    
        public static void patter(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        public static void main(String args[]){
            int n = 5;
            patter(n);
        }
 
    
}