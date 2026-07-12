import java.util.*;

public class Problem1 {
    public Map<String, Integer> countFailedTests(List<String> logs){
        Map<String, Integer> resultMap=new HashMap<>();
        int count=0;
        for (String eachLog: logs){
            String[] parts=eachLog.split("\\s");
            if(parts[0].equalsIgnoreCase("FAIL")){
                resultMap.put(parts[1], resultMap.getOrDefault(parts[1], 0)+1);
            }
        }
        return resultMap;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many inputs : ");
        int numberOfInput=sc.nextInt();
        sc.nextLine();
        List<String> acceptLogs=new ArrayList<>();
        for (int i=0;i<numberOfInput;i++){
            acceptLogs.add(sc.nextLine());
        }
        Problem1 object=new Problem1();
        Map<String, Integer>result=new HashMap<>();
        result=object.countFailedTests(acceptLogs);
        for (Map.Entry<String, Integer> eachMapElement : result.entrySet()){
            String testName= eachMapElement.getKey();
            Integer numberOfTests= eachMapElement.getValue();
            System.out.println(testName+"="+numberOfTests);
        }
    }
}
