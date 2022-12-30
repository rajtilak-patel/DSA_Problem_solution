/*
 * inputs 
 * 1
6
100 60 70 65 80 85

outputs 
1 1 2 1 4 5
 */
import java.util.*;
public class Solve_a_Financial_problem {
     public static Stack<Integer> s = new Stack<>();
     public  static ArrayList<Integer> calculateSpan(int arr[],int n)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            while (!s.empty() && arr[s.peek()] <= arr[i])
                  s.pop();
 
            if (s.isEmpty())
                ans.add(i + 1);
            else {
                int top = s.peek();
                ans.add(i - top);
            }
            s.push(i);
        }
 
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
             int n = sc.nextInt();
             int price[] = new int[n];
             for(int i=0;i<n;i++){
                 price[i] = sc.nextInt();
             }
        //     int ans1[] = new int[n];
 
             ArrayList<Integer> ans =  calculateSpan(price, n);
            for (int i = 0; i < ans.size(); i++){
                 System.out.print(ans.get(i) + " ");
            }
            System.out.println();
          //  printArray(ans);
            test--;
        }
       
    }
}