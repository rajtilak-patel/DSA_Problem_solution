
public class Say_digite_recursion
{
    public static void sayDigit(int n,String arr[]){
        // base case 
        if(n==0){
            return ;
        }
        
        int digit = n%10;
        n = n/10;
        
        sayDigit(n,arr);
        System.out.print(arr[digit]+" ");
    }
	public static void main(String[] args) {
		int n = 512;
		
		String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		sayDigit(n,arr);
	}
}
