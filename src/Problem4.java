import java.util.*;

public class Problem4 {
    // Returns only test names that occur more than once, along with their counts.
    public Map<String, Integer> findDuplicateTestCases(List<String> inputList){
        Map<String, Integer> calculateMap=new HashMap<>();
        // Count each occurrence of every input test name.
        for (String eachInput:inputList){
            calculateMap.put(eachInput,calculateMap.getOrDefault(eachInput,0)+1);
        }
        Map<String, Integer> newMap=new HashMap<>();
        // Keep entries whose total count indicates a duplicate.
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
