
public class Min_max_value{

	public static void main(String[] args) {
	 int arr[] = {2,5,7,8,6,1,75,45,-8};
	 int n = 9;
	 int max = 0;
     int min = 0;
    for(int i=0;i<n;i++){
        if(arr[i]>arr[max]){
            max = i;
        }
        if(arr[i]<arr[min]){
            min = i;
        }
      }
      System.out.println(arr[min]+" "+arr[max]);
	}
}