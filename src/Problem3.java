import java.util.*;

public class Problem3 {
    public Map<String, List<String>> groupTestCasesByStatus(List<String> logs){
        Map<String, List<String>> calculateMap = new HashMap<>();
        for (String eachLogs:logs){
            String[] partLogs=eachLogs.split("\\s");
            List<String> checkList=calculateMap.get(partLogs[0]);
            if(checkList==null){
                checkList=new ArrayList<>();
            }
            checkList.add(partLogs[1]);
            calculateMap.put(partLogs[0], checkList);
        }
        return calculateMap;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> acceptLogs = new ArrayList<>();
        System.out.println("Enter number of inputs");
        int inputCount=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<inputCount;i++){
            acceptLogs.add(sc.nextLine());
        }
        Problem3 object = new Problem3();
        Map<String, List<String>> outputMap = new HashMap<>();
        outputMap=object.groupTestCasesByStatus(acceptLogs);
        for (Map.Entry<String, List<String>> eachElement : outputMap.entrySet()){
            String key=eachElement.getKey();
            List<String> value=eachElement.getValue();
            System.out.println(key+"="+value);
        }
    }
}
