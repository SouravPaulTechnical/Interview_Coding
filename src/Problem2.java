import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem2 {
    // Returns the first character that occurs exactly once, or null if none exists.
    public Character firstNonRepeatingCharacter(String inputString){
        Map<Character, Integer> checkMap=new HashMap<>();
        char[] stringCharArray=inputString.toCharArray();
        // First pass records how often each character appears.
        for (char eachChar: stringCharArray){
            checkMap.put(eachChar, checkMap.getOrDefault(eachChar, 0)+1);
        }
        // Second pass preserves the original order when finding the first unique character.
        for (char eachChar:stringCharArray){
            if(checkMap.get(eachChar)==1){
                return eachChar;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String inputString = sc.nextLine();
        Problem2 object=new Problem2();
        Character result = object.firstNonRepeatingCharacter(inputString);
        System.out.println(result);
    }
}
