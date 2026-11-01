import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem15 {
    public static void checkLongestWordUsingMap(String inputString){
        String[] eachWord = inputString.split("\\s");
        Map<String, Integer> storeEachLengthOfWord = new HashMap<>();
        for (String singleWord : eachWord){
            storeEachLengthOfWord.put(singleWord, singleWord.length());
        }
        for (Map.Entry<String, Integer> eachMapElement : storeEachLengthOfWord.entrySet()){
            if (eachMapElement.getValue()==Collections.max(storeEachLengthOfWord.values())){
                System.out.println("Longest Word : "+eachMapElement.getKey());
            }
        }
    }

    public static void checkLongestWordSimple(String inputString){
        String[] eachWordInString = inputString.split("\\s");
        String longestWord="";
        for (String s:eachWordInString){
            if (s.length() > longestWord.length()){
                longestWord=s;
            }
        }
        System.out.println("Longest Word : "+longestWord);
    }
    public static void main(String[] args) {
        String inputString = "Java is a powerful programming language";
        checkLongestWordUsingMap(inputString);
        checkLongestWordSimple(inputString);
    }
}
