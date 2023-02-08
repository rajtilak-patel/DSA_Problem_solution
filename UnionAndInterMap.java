
import java.util.HashMap;
import java.util.Map;


public class UnionAndInterMap {
    public static void solveMap(int arr1[],int arr2[]){
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            mp.put(arr1[i],i);

        }
        // Set<Integer> keys = mp.keySet();
        // for (Integer key: keys) {
        //     System.out.print(key+" ");
        // }
        System.out.println(mp.size());
        // for(int i=0;i<arr2.length;i++){
        //     mp.put(arr2[i],i);
        // }
        

    }
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3};

        solveMap(arr1,arr2);
    }
}
