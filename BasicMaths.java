
import java.util.*;
public class BasicMaths{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        int i=0;
        int smallNum = -1;
        int ans = 0;
        int value = -1;
        while(i<n){
            if((sum-arr[i])%7==0){
                smallNum = sum-arr[i];
                if(smallNum>ans){
                    ans = smallNum;
                    value = i;
                }
            }
            i++;
        }
        System.out.println(value);
        
    }
}