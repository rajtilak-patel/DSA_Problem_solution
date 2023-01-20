// 6
// rancho 45
// chatur 32
// raju 30
// farhan 28
// virus 32
// joy 45

// outputs
/*
1 joy
1 rancho
3 chatur
3 virus
5 raju
6 farhan
*/

import java.util.*;
public class Make_leaderBoard{
    
    public static boolean compare(String a, String b){
        int m = a.length();
        int n = b.length();
        boolean flag = false;
        for(int i=0; i<m && i<n; i++){
            if((int)(a.charAt(i))<(int)(b.charAt(i))){
                break;
            }
            else if((int)(a.charAt(i))>(int)(b.charAt(i)))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str[] = new String[num];
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            str[i] = sc.next();
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                boolean flag = false;
                if(arr[i]<arr[j]){
                    flag = true;
                }
                else if(arr[i]==arr[j] && compare(str[i], str[j])){
                    flag = true;
                }
                if(flag){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    String t = str[i];
                    str[i] = str[j];
                    str[j] = t;
                }
            }
        }
        int n = 1;
        System.out.println(n+" "+str[0]);
        for(int i=1;i<num;i++){
                n = (arr[i-1]==arr[i])?n:(i+1);
                System.out.println(n+" "+str[i]);
        }
    }
}