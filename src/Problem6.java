import java.util.HashMap;
import java.util.Scanner;

public class Problem6 {
    // Finds and prints the longest substring with no repeated characters, then returns its length.
    public int calculateLongestSubstring(String inputString){
        HashMap<Character, Integer> calculateIndex=new HashMap<>();
        char[] eachCharacter=inputString.toCharArray();
        int left=0;
        int maxLength=0;
        int right;
        int maxStart=0;
        // The window [left, right] is kept free of repeated characters.
        for (right=0;right<eachCharacter.length;right++){
            Character c=eachCharacter[right];
            // Move the window past the previous occurrence if it lies inside the window.
            if (calculateIndex.containsKey(c)){
                left=Math.max(left, calculateIndex.get(c)+1);
            }
            // Save the latest index and remember the longest window seen so far.
            calculateIndex.put(c, right);
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                maxStart = left;
            }
            maxLength=Math.max(maxLength, right-left+1);
        }
        System.out.println(inputString.substring(maxStart, maxStart+maxLength));
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String inputString = sc.nextLine();
        Problem6 object=new Problem6();
        int result=object.calculateLongestSubstring(inputString);
        System.out.println(result);
    }
}
