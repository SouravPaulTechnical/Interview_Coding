public class Problem23 {
    /**
     * Converts the digit array to an {@code int}, adds one, and extracts the
     * decimal digits into an array of the original length. This arithmetic
     * approach is limited by {@code int} range and does not handle a carry that
     * increases the number of digits; {@link #simplePlusOne(int[])} handles
     * those cases directly.
     */
    public static int[] plusOne(int[] inputArray){
        int arrayLength = inputArray.length;
        int[] resultArray = new int[arrayLength];
        int sum=0;
        int counter=arrayLength-1;
        // Reconstruct the represented number using each digit's decimal place.
        for (int i=0;i<arrayLength;i++){
            sum=sum+inputArray[i]*(int)(Math.pow(10,counter));
            counter--;
        }
        counter=arrayLength-1;
        // Add one, then extract decimal digits from the most significant place.
        int new_value=sum+1;
        int que=0;
        int arrayPositionCount=0;
        while(new_value!=0){
            que=new_value/(int)(Math.pow(10,counter));
            new_value=new_value%(int)(Math.pow(10,counter));
            counter--;
            resultArray[arrayPositionCount]=que;
            arrayPositionCount++;
        }
    return resultArray;
    }

    /**
     * Increments the digit array from right to left, carrying through trailing
     * nines. If every digit was nine, returns a new array with a leading one.
     * The input array is modified when no extra digit is needed.
     */
    public static int[] simplePlusOne(int[] inputArray){
        for (int i=inputArray.length-1;i>=0;i--){
            // A digit below nine can be incremented without carrying further.
            if (inputArray[i]<9){
                inputArray[i]++;
                return inputArray;
            }
            // Nine becomes zero and the carry continues to the digit on its left.
            inputArray[i]=0;
        }
        // All digits were nine, so the result needs one extra leading digit.
        int[] resultArray=new int[inputArray.length+1];
        resultArray[0]=1;
        return resultArray;
    }

    public static void main(String[] args) {
        // This example exercises the carry across all digits: 999 becomes 1000.
        int[] inputArray = new int[]{9,9,9};
//        int[] catchArray=plusOne(inputArray);
        int[] catchArray=simplePlusOne(inputArray);
        for (int eachCatchArray : catchArray){
            System.out.print(eachCatchArray+",");
        }
    }
}
