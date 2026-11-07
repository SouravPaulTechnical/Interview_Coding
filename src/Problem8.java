import java.util.Scanner;

public class Problem8 {
    public static void main(String args[]){
        // Read a sequence assumed to contain the numbers 1 through its final element, with one missing.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the list : ");
        int arrayLength = sc.nextInt();
        int[] arrayElements = new int[arrayLength];
        System.out.println("Enter elements one by one : ");
        for (int i=0;i<arrayLength;i++){
            arrayElements[i]=sc.nextInt();
        }
        // Use the arithmetic-series total, then subtract the sum of the supplied values.
        int lastElement = arrayElements[arrayLength-1];
        int sumOfAllElements = (lastElement*(lastElement+1))/2;
        int sumOfExistingElement=0;
        for (int eachElement : arrayElements){
            sumOfExistingElement=sumOfExistingElement+eachElement;
        }
        System.out.println("Missing element is : "+(sumOfAllElements-sumOfExistingElement));
    }
}
