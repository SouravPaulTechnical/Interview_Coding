import java.util.LinkedHashSet;
import java.util.Set;

public class Problem14 {
    public static void checkResult(String inputString){
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
