import java.util.LinkedHashSet;
import java.util.Set;

public class Problem14 {
    // Removes repeated characters while preserving their first-seen order.
    public static void checkResult(String inputString){
        // LinkedHashSet keeps insertion order while ensuring each character appears once.
        Set<Character> checkSet = new LinkedHashSet<>();
        for (char c:inputString.toCharArray()){
            checkSet.add(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c:checkSet){
            stringBuilder.append(c);
        }
        System.out.println("Output : "+stringBuilder);
    }
    public static void main(String[] args) {
        String inputString = "Programming";
        checkResult(inputString);
    }
}
