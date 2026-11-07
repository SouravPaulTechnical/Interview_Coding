import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Problem11 {
    // Groups words that are anagrams by using their sorted characters as a shared key.
    public static void checkAnagrams(String[] arrayElements){
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String eachArrayElement : arrayElements){
            // Sorting makes anagrams produce the same key.
            char[] eachElement=eachArrayElement.toCharArray();
            Arrays.sort(eachElement);
            String eachString = new String(eachElement);
            if (anagrams.containsKey(eachString)){
                anagrams.get(eachString).add(eachArrayElement);
            }
            else{
                List<String> newList=new ArrayList<>();
                newList.add(eachArrayElement);
                anagrams.put(eachString, newList);
            }
        }
        System.out.println(anagrams.values());
    }
    public static void main(String[] args) {
        String arrayElements[]=new String[]{"eat", "ate", "tea", "nat", "tan", "bat"};
        checkAnagrams(arrayElements);
    }
}
