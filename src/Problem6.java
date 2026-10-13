import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem6 {
    public Map<Character, Integer> countFrequency(String inputString){
        Map<Character, Integer> calculateMap=new HashMap<>();
        char[] eachCharInString = inputString.toCharArray();
        for (Character c:eachCharInString){
            calculateMap.put(c, calculateMap.getOrDefault(c, 0)+1);
        }
        return calculateMap;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String inputString=sc.nextLine();
        Problem6 object=new Problem6();
        Map<Character, Integer> resultMap=object.countFrequency(inputString);
        for (Map.Entry<Character, Integer> eachMapElement:resultMap.entrySet()){
            System.out.println(eachMapElement.getKey()+" = "+eachMapElement.getValue());
        }
    }
}
