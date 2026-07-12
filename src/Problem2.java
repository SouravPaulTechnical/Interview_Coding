import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem2 {
    public Character firstNonRepeatingCharacter(String inputString){
        Map<Character, Integer> checkMap=new HashMap<>();
        char[] stringCharArray=inputString.toCharArray();
        for (char eachChar: stringCharArray){
            checkMap.put(eachChar, checkMap.getOrDefault(eachChar, 0)+1);
        }
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
