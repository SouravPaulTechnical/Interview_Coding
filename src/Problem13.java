import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem13 {
    // Prints values from the second array that also occur in the first, using a map.
    public static void checkResultUsingMap(int[] inputArray1, int[] inputArray2){
        Map<Integer, Integer> storeFirstArray = new HashMap<>();
        int counter=0;
        // Store first-array values, then check each value from the second array.
        for (int i=0;i<inputArray1.length;i++){
            storeFirstArray.put(i,inputArray1[i]);
        }
        for (int j=0;j<inputArray2.length;j++){
            if (storeFirstArray.containsValue(inputArray2[j])){
                System.out.println(inputArray2[j]);
                counter++;
            }
        }
        if (counter==0){
            System.out.println("There is no intersection element");
        }
    }

    // Prints distinct shared values by using sets for membership and result collection.
    public static void checkResultUsingSet(int[] inputArray1, int[] inputArray2){
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        int counter=0;
        for (int i=0;i<inputArray1.length;i++){
            set.add(inputArray1[i]);
        }
        for (int i=0;i<inputArray2.length;i++){
            if (set.contains(inputArray2[i])){
                resultSet.add(inputArray2[i]);
                counter++;
            }

        }
        for (int eachElement : resultSet){
            System.out.println("\t" + eachElement);
        }
        if (counter==0){
            System.out.println("There is no intersection element");
        }
    }
    public static void main(String[] args) {
        int[] inputArray1 = new int[]{1,2,3,4};
        int[] inputArray2 = new int[]{2,2,2,4};
        checkResultUsingMap(inputArray1, inputArray2);
        checkResultUsingSet(inputArray1, inputArray2);
    }
}
