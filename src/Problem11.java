import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int arrayLength = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter string elements one by one : ");
        String[] arrayElements = new String[arrayLength];
        for (int i=0;i<arrayLength;i++){
            arrayElements[i]=sc.nextLine();
        }

    }
}
