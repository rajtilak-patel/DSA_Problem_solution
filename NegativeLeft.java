public class NegativeLeft {
    public static void main(String args[]){
        int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
        int n = arr.length;
        int j = 0 ;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
