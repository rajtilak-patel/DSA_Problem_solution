// inputs 
// 2
// 5 31
// 10 11 13 17 21
// 5 44
// 10 11 13 17 21
// outputs 
// Yes 
// No
import java.util.*;
public class TeamofHeroes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        while(test-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int i=0;
            int j=n-1;
            boolean flag = false;
            while(i<j){
                if(arr[i]+arr[j]==k){
                    flag = true;
                    break;
                }
                else if(arr[i]+arr[j]>k){
                     j--;
                }
                else{
                    i++;
                }
            }
            if(flag){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}