import java.util.Arrays;
import java.util.List;

public class Problem12 {
    // Moves nonzero values to the front in their original order and prints the result.
    public static void checkResult(int[] inputArray){
        // zeroIndex marks the next position where a nonzero value belongs.
        int zeroIndex=0;
        for (int i=0;i<inputArray.length;i++){
            if (inputArray[i] != 0) {

                // Swap this nonzero value into the front portion of the array.
                int temp = inputArray[i];
                inputArray[i] = inputArray[zeroIndex];
                inputArray[zeroIndex] = temp;

                zeroIndex++;
            }
        }
        for (int resultElement:inputArray){
            System.out.println("\t"+resultElement);
        }
    }
    public static void main(String[] args) {
        int[] inputArray = new int[]{1,0,3,4,0,5};
        checkResult(inputArray);
    }
}
