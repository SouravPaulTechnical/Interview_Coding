import java.util.HashMap;
import java.util.Map;

public class Problem24 {
    public int optimalSolution(int[] inputArray){
        // Case 1: XOR gives the required O(n) time and O(1) extra space.
        // Equal values cancel because x ^ x is 0, leaving the single value.
        if (inputArray==null || inputArray.length<1){
            return 0;
        }
        int result=0;
        for (int eachElement : inputArray){
            result^=eachElement;
        }
        return result;
    }
    public  int singleNumber(int[] inputArray){
        // Case 2: Count occurrences with a map, then return the value seen once.
        // This is an alternative with O(n) time and O(n) extra space.
        if (inputArray==null || inputArray.length<1){
            return 0;
        }
        Map<Integer, Integer> checkFrequency = new HashMap<>();
        for (int eachElement : inputArray){
                checkFrequency.put(eachElement, checkFrequency.getOrDefault(eachElement, 0)+1);
        }
        for (Map.Entry<Integer, Integer> eachFrequrncy : checkFrequency.entrySet()){
            if (eachFrequrncy.getValue()==1){
                return eachFrequrncy.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] inputArray = new int[]{4,2,1,2,1};
//        System.out.println(new Problem24().singleNumber(inputArray));
        System.out.println(new Problem24().optimalSolution(inputArray));
    }
}
