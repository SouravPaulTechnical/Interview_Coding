import java.util.*;

public class Problem5 {
    public List<String> topKFailedTests(List<String> inputList, int kValue){
        Map<String, Integer> calculateMap=new HashMap<>();
        for (String eachInput:inputList){
            calculateMap.put(eachInput, calculateMap.getOrDefault(eachInput,0)+1);
        }
        List<Map.Entry<String, Integer>> list=new ArrayList<>(calculateMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        List<String> finalList=new ArrayList<>();
        for (Map.Entry<String, Integer> eachMapElement:list){
            finalList.add(eachMapElement.getKey());
        }
        return finalList.subList(0,kValue);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfInput=sc.nextInt();
        sc.nextLine();
        List<String> inputList=new ArrayList<>();
        for (int i=0;i<numberOfInput;i++){
            inputList.add(sc.nextLine());
        }
        int kValue=sc.nextInt();
        Problem5 object=new Problem5();
        List<String> result=object.topKFailedTests(inputList, kValue);
        System.out.println(result);
    }
}
