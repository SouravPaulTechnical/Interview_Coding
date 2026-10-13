public class Problem7 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        System.out.println("Before swaping a : "+a+" b : "+b);
        a=a.concat(b);
        System.out.println("After concatination : "+a);
        b = a.substring(0, b.length());
        System.out.println("after swaping value of b : "+b);
        a=a.substring(b.length());
        System.out.println("after swaping value of a : "+a);
        System.out.println("After swaping a : "+a+" b : "+b);

    }
}
