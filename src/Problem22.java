public class Problem22 {
    /**
     * Finds the longest prefix shared by every string in the input array.
     * Characters are checked from left to right against the first string, so
     * the scan stops as soon as any string ends or has a different character.
     * Returns "Error" when the array is null or empty; an array containing
     * an empty string naturally produces an empty prefix. Runs in O(n * m)
     * time in the worst case, where n is the number of strings and m is the
     * length of the shortest string.
     */
    public static String longestCommonPrefix(String[] inputString){
        StringBuilder stringBuilder=new StringBuilder();
        // There is no first string to compare when the array is missing or empty.
        if (inputString==null || inputString.length==0){
            return "Error";
        }
        // Use the first string as the candidate prefix, checking one character at a time.
        for (int i=0;i<inputString[0].length();i++) {
            boolean isMatching=true;
            // Every remaining string must contain the same character at this position.
            for (int j=1;j<inputString.length;j++){
                // A shorter string cannot share this position, so the prefix ends here.
                if (i>=inputString[j].length()){
                    isMatching=false;
                    break;
                }
                if (inputString[0].charAt(i)!=inputString[j].charAt(i)){
                    isMatching=false;
                    break;
                }
            }
            if (isMatching){
                // This character is common to all strings; extend the prefix.
                stringBuilder.append(inputString[0].charAt(i));
            }
            else {
                // Prefix characters must be contiguous, so later matches do not matter.
                break;
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        // Example strings share the prefix "fl".
        String[] inputString = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(inputString));
    }
}
