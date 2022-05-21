import java.util.HashMap;

/**
 * Given a set of array and a target sum checking if any of the two elements in the array addup to the value
 * If there is such value print the value of the index of two such number
 */


public class TwoSum {
    public static void main(String[] args) {
       int[] arr = new int[]{15,10,3,22,5,6,12,56,76,-1};
       int targetValue = 75;
       HashMap<Integer,Integer> map =  new HashMap<>();
       
       for(int i=0;i<arr.length;i++){
        map.put(arr[i], i);
       }

       for(int i=0;i<arr.length;i++){
           int key = targetValue - arr[i];
           if(map.containsKey(key)){
                int firstIndex = i;
                int secondIndex = map.get(key);
                System.out.println("First index = "+firstIndex+"\nSecond index ="+secondIndex);
                break;
           }
       }
       
    }
}
