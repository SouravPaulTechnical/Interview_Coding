import java.util.HashMap;
import java.util.Map;

public class Problem16 {
    // Returns true if any integer in the array occurs more than once.
    public static boolean checkDuplicateElement(int[] inputArray){
        Map<Integer, Integer> storeFrequencyOfEachNumber = new HashMap<>();
        // Count each value, then check whether any frequency exceeds one.
        for (int eachNumber : inputArray){
            storeFrequencyOfEachNumber.put(eachNumber, storeFrequencyOfEachNumber.getOrDefault(eachNumber,0)+1);
        }
        for (Map.Entry<Integer, Integer> eachFrequency : storeFrequencyOfEachNumber.entrySet()){
            if (eachFrequency.getValue()>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,2,3,4};
        boolean result = checkDuplicateElement(inputArray);
        System.out.println(result);
    }
}
