public class CyclicallyRotateInOne {
    public static void rotation(int arr[],int n){
        int x = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {7,8,6,5,9};
        int n = arr.length;
        rotation(arr,n);
    }
}
