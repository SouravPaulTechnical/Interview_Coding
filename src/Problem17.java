public class Problem17 {
    // Returns the second-largest distinct value in the array.
    public static int checkSecondLargestElement(int[] inputArray){
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        if (inputArray==null || inputArray.length<1){
            throw new IllegalArgumentException(
                    "Array must contain 2 unique elements"
            );
        }
        // Track the two largest distinct values while scanning each element once.
        for (int eachNumber : inputArray){
            if (eachNumber == largestNumber){
                continue;
            }
            if (eachNumber>largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = eachNumber;
            }
            else if (eachNumber > secondLargestNumber){
                secondLargestNumber = eachNumber;
            }
        }

        if (secondLargestNumber == Integer.MIN_VALUE){
            throw new IllegalArgumentException(
                    "Array must contain 2 unique elements"
            );
        }
        return secondLargestNumber;
    }
    public static void main(String[] args) {
        int[] inputArray = new int[]{10, 5, 20, 8, 20, 15};
        System.out.println(checkSecondLargestElement(inputArray));
    }
}
