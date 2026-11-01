import java.util.HashMap;
import java.util.Map;

public class Problem19 {
    public static boolean checkUniqueCharacter(String inputString){
        Map<Character, Integer> frequencyOfEachCharacter = new HashMap<>();
        for (char c : inputString.toCharArray()){
            frequencyOfEachCharacter.put(
                    c, frequencyOfEachCharacter.getOrDefault(c, 0)+1
            );
        }
        for (Map.Entry<Character, Integer> frequencyCheck : frequencyOfEachCharacter.entrySet()){
            if (frequencyCheck.getValue()>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String inputString = "sourav";
        System.out.println("Unique String : "+checkUniqueCharacter(inputString));
    }
}
