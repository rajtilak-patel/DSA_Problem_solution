public class Sort012 {
    public static void sort(int arr[], int n)
    {
        // code here 
        int k = 0;
        int ans[] = new int[n];
        for(int i=0;i<=2;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    ans[k] = i;
                    k++;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {0,2,1,2,0,1,2,0,2,1,0,2,1,1,0,2};
        int n = arr.length;
        sort(arr,n);
    }
}
