public class ReverseArray {

    public static void main(String args[]){
        int arr[] = {1,2,3,7,7,8,48,4,5,6};
        int arr2[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            arr2[i] = arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}