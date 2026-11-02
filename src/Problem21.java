import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Problem21 {
    private static final Logger logger = Logger.getLogger(Problem21.class.getName());
    /**
     * Returns the first number that appears exactly once, or -1 if none does.
     * Counts are stored in a map, then the input is scanned again to preserve
     * the original order. The method runs in O(n) time.
     */
    public static int firstNonRepeatingNumber(int[] inputNumbers){
        logger.info(() -> "Searching for the first non-repeating number in "
                + inputNumbers.length + " values.");
        Map<Integer, Integer> calculateFrequency = new HashMap<>();
        // Count how many times each number occurs.
        for (int eachNumber : inputNumbers){
            calculateFrequency.put(eachNumber,
                    calculateFrequency.getOrDefault(eachNumber, 0)+1
            );
        }
        logger.fine(() -> "Number frequencies: " + calculateFrequency);
        // Return the first number whose frequency is one.
        for (int numbers : inputNumbers){
            if (calculateFrequency.get(numbers)==1){
                logger.info(() -> "First non-repeating number found: " + numbers);
                return numbers;
            }
        }
        // No number occurs exactly once.
        logger.info("No non-repeating number found.");
        return -1;
    }
    public static void main(String[] args) {
        // Sample input demonstrates finding the first non-repeating number.
        int[] inputNumbers = new int[]{1,2,3,2,1};
        logger.info(() -> "Result: " + firstNonRepeatingNumber(inputNumbers));
    }
}
