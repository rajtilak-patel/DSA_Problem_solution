
//Enter code here

/*
 * inputs 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;
public class Odd_subset{
    public static int solve(int arr[],List<Integer>output,int index,List<List<Integer>> ans){
        int count = 0;
        int sum = 0;
        if(index>=arr.length){
            ans.add(output);
            for(int i=0;i<output.size();i++){
                sum = sum+output.get(i);
            }
            
           if(sum%2 !=0){
               count +=1;
           }
           
            return count;
        }
        // exclude call
        count += solve(arr,output,index+1,ans);
        
           //include call
        output.add(arr[index]);
        count += solve(arr,output,index+1,ans);
        output.remove(output.size()-1);
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        
        int subset = solve(arr,output,0,ans);
        System.out.println(subset);
    }
}