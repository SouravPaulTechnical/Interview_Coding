import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem10 {
    public static char checkNonRepeatingCharacter(String string){
        String inputString = string.replaceAll("\\s", "").toLowerCase();
        Map<Character, Integer> checkMap = new HashMap<>();
        for (int i=0;i<inputString.length();i++){
            checkMap.put(inputString.charAt(i),checkMap.getOrDefault(inputString.charAt(i),0)+1);
        }
        for (int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            if (checkMap.get(ch)==1){
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String args[]){
        System.out.println("Enter String : ");
        String inputString = new Scanner(System.in).nextLine();
        char resultChar = checkNonRepeatingCharacter(inputString);
        if (resultChar == '\0'){
            System.out.println("No non-repeating character");
        }
        else {
            System.out.println(resultChar);
        }
    }
}
