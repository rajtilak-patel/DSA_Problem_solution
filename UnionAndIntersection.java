import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static void unionIntersection(int arr1[],int arr2[]){
        Set<Integer> s = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            s.add(arr2[i]);
        }
        System.out.println(s.size());
       // System.out.print(s.toString()+ " ");
    }
    public static void main(String args[]){
       int arr1[] = {1,2,3,4,5} ;
       int arr2[] = {1,2,3} ;

       unionIntersection(arr1,arr2);
    }
}
