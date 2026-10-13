import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem9 {
    public static void checkTargetNumber(int[] arrayElements, int targetNumber){
        Map<Integer, Integer> checkTargetNumber = new HashMap<>();
        int compliment = 0;
        for (int i=0;i<arrayElements.length; i++){
            compliment=targetNumber-arrayElements[i];
            if (checkTargetNumber.containsKey(compliment)){
                System.out.println("Index values are : "+checkTargetNumber.get(compliment)+ " "+i);
            }
            else{
                checkTargetNumber.put(arrayElements[i], i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int arrayLength = sc.nextInt();
        int[] arrayElements = new int[arrayLength];
        System.out.println("Enter elements one by one : ");
        for (int i=0;i<arrayLength;i++){
            arrayElements[i] = sc.nextInt();
        }
        System.out.println("Enter target number : ");
        int targetNumber = sc.nextInt();
        checkTargetNumber(arrayElements, targetNumber);
    }
}
