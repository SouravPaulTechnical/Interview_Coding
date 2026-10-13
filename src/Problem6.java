import java.util.HashMap;
import java.util.Scanner;

public class Problem6 {
    public int calculateLongestSubstring(String inputString){
        HashMap<Character, Integer> calculateIndex=new HashMap<>();
        char[] eachCharacter=inputString.toCharArray();
        int left=0;
        int maxLength=0;
        int right;
        int maxStart=0;
        for (right=0;right<eachCharacter.length;right++){
            Character c=eachCharacter[right];
            if (calculateIndex.containsKey(c)){
                left=Math.max(left, calculateIndex.get(c)+1);
            }
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
