import java.util.*;

public class Problem4 {
    public Map<String, Integer> findDuplicateTestCases(List<String> inputList){
        Map<String, Integer> calculateMap=new HashMap<>();
        for (String eachInput:inputList){
            calculateMap.put(eachInput,calculateMap.getOrDefault(eachInput,0)+1);
        }
        Map<String, Integer> newMap=new HashMap<>();
        for (String eachInput:inputList){
            if (calculateMap.get(eachInput)>1){
                newMap.put(eachInput, calculateMap.get(eachInput));
            }
        }
        return newMap;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of inputs : ");
        int inputNumber=sc.nextInt();
        sc.nextLine();
        List<String> inputList=new ArrayList<>();
        for (int i=0;i<inputNumber;i++){
            inputList.add(sc.nextLine());
        }
        Problem4 object=new Problem4();
        Map<String, Integer> resultMap=new HashMap<>();
        resultMap=object.findDuplicateTestCases(inputList);
        for (Map.Entry<String, Integer> eachSet: resultMap.entrySet() ){
            String eachTestcases= eachSet.getKey();
            Integer duplicateNumber = eachSet.getValue();
            System.out.println(eachTestcases+"="+duplicateNumber);
        }
    }
}
