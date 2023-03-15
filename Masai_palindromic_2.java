public class Masai_palindromic_2 {
    public static void Masai_palindromic(String str){
        //write your code here
        int count = 1;
        int totalCount = 1;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                   if(mirror(str,i,j)){
                        count = (j-i+1);
                        if(count>totalCount){
                            totalCount = count;
                        }
                    }
                }
            }
         }
         System.out.println(totalCount);
      }
      
      public static boolean mirror(String str,int i,int j){
          int start = i;
          int end = j;
          while(start<end){
              if(str.charAt(start) != str.charAt(end)){
                  return false;
              }
                start++;
                end--;
             }
              return true;
      }

      public static void main(String args[]){
        String str = "thisracecarisgood";
        Masai_palindromic(str);
      }
    
}
