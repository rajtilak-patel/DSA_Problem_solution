public class NegativeLeftTwoPointer{
    public static void main(String args[]){
        int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
        int n = arr.length-1;
        int left = 0, right = n;
        while (left < right)
      {
         
        // Condition to check if the left
        // and the right elements are
        // negative
        if (arr[left] < 0 && arr[right] < 0)
            left++;
 
        // Condition to check if the left
        // pointer element is positive and
        // the right pointer element is negative
        else if (arr[left] > 0 && arr[right] < 0)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
 
        // Condition to check if both the
        // elements are positive
        else if (arr[left] > 0 && arr[right] > 0)
            right--;
        else
        {
            left++;
            right--;
        }
    }

        for(int l=0;l<=n;l++){
            System.out.print(arr[l]+" ");

        }

    }
}