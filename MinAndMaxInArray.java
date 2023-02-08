public class MinAndMaxInArray {
    public static void main(String args[]) {
        int arr[] = {4,1,2,3,7,8,5,64,75,12,-8,-45};
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min+" "+max);
        
    }
}
