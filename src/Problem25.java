import java.util.HashSet;
import java.util.Set;

public class Problem25 {
    public boolean containsDuplicate(int[] inputArray){
        if (inputArray==null || inputArray.length<1){
            return false;
        }
        Set<Integer> collectElements = new HashSet<>();
        for (int eachElement : inputArray){
            if (collectElements.contains(eachElement)){
                // Case 1: this value was seen earlier, so a duplicate exists.
                return true;
            }
            else {
                // Case 2: first occurrence; remember it and keep scanning.
                collectElements.add(eachElement);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,2,3,1};
        System.out.println(new Problem25().containsDuplicate(inputArray));
    }
}
