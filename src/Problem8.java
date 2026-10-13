import java.util.Scanner;

public class Problem8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the list : ");
        int arrayLength = sc.nextInt();
        int[] arrayElements = new int[arrayLength];
        System.out.println("Enter elements one by one : ");
        for (int i=0;i<arrayLength;i++){
            arrayElements[i]=sc.nextInt();
        }
        int lastElement = arrayElements[arrayLength-1];
        int sumOfAllElements = (lastElement*(lastElement+1))/2;
        int sumOfExistingElement=0;
        for (int eachElement : arrayElements){
            sumOfExistingElement=sumOfExistingElement+eachElement;
        }
        System.out.println("Missing element is : "+(sumOfAllElements-sumOfExistingElement));
    }
}
