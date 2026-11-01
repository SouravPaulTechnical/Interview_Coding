import java.util.Arrays;
import java.util.List;

public class Problem12 {
    public static void checkResult(int[] inputArray){
        int zeroIndex=0;
        for (int i=0;i<inputArray.length;i++){
            if (inputArray[i] != 0) {

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
