public class Pattern_printing {
public static void patternPrinting(int num){
    //write your code here
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

  public static void main(String args[]){
     int num = 4;
     patternPrinting(num);
  }
}