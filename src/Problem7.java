import java.util.*;

public class Problem7 {
    public List<int[]> mergeExecutionWindows(List<int[]> intervals){
        Collections.sort(intervals, (arr1, arr2)-> Integer.compare(arr1[0], arr2[0]));
        ArrayList<int[]> mergedIntervals=new ArrayList<>();
        if (intervals.isEmpty()){
            return mergedIntervals;
        }
        else {
            mergedIntervals.add(intervals.getFirst());
        }
        for (int i=1;i<intervals.size();i++){
            if (mergedIntervals.getLast()[1]<intervals.get(i)[0]){
                mergedIntervals.add(intervals.get(i));
            }
            else {
                mergedIntervals.getLast()[1]=Math.max(mergedIntervals.getLast()[1], intervals.get(i)[1]);
            }
        }
        return mergedIntervals;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<int[]> eachIntervals=new ArrayList<>();
        System.out.println("Enter how many intervals : ");
        int intervals=sc.nextInt();
        sc.nextLine();
        int startTime=0;
        int endTime=0;
        for (int i=1;i<=intervals;i++){
            System.out.println("Enter "+i+" start and end time : ");
            int[] intervalArray=new int[2];
            startTime=sc.nextInt();
            endTime=sc.nextInt();
            intervalArray[0]=startTime;
            intervalArray[1]=endTime;
            eachIntervals.add(intervalArray);
        }
        /*This portion to check whether the input in the list is correct*/
        System.out.println("Input Check");
        for (int[] eintervals:eachIntervals){
            System.out.println(Arrays.toString(eintervals));
        }
        Problem7 object=new Problem7();
        List<int[]> resultSet=object.mergeExecutionWindows(eachIntervals);
        System.out.println("Output");
        for (int[] resultIntervals: resultSet){
            System.out.println(Arrays.toString(resultIntervals));
        }

    }
}
