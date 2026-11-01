import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem18 {
    public static Character checkMaximumOccuringCharacter(String inputString){
        Map<Character, Integer> frequencyOfEachCharacter = new HashMap<>();
        for (char c : inputString.toCharArray()){
            frequencyOfEachCharacter.put(c,frequencyOfEachCharacter.getOrDefault(c,0)+1);
        }
        int maximumValue = Collections.max(frequencyOfEachCharacter.values());
        for (Map.Entry<Character, Integer> findKey : frequencyOfEachCharacter.entrySet()){
            if (findKey.getValue()==maximumValue){
                return findKey.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String inputString = "Programming";
        Character result = checkMaximumOccuringCharacter(inputString);
        System.out.println(result!=null ? String.valueOf(result) : "No Character Found");
    }
}
