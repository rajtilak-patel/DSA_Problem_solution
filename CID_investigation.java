

import java.util.*;
public class CID_investigation
{
  public static List<String> list = new ArrayList<>();
  public static List<String> k = new ArrayList<>
  (Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));

	public static void fun(String s,int start,String str)
	{
		if(start==s.length())
		{
			list.add(str);
			return;
		}
		String x = k.get(s.charAt(start)-'0');
		for(int i=0;i<x.length();i++)
			fun(s,start+1,str+x.charAt(i));
	}
	
	public static List<String> letterCombinations(String digits) 
	{
		if(digits.length()==0)
			return list;
		fun(digits,0,"");
		for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
        } 
		return list;
	}
	public static void main(String[] args) {
		String str = "23";
		letterCombinations(str);
	}
}
