import java.util.*;

public class prac3a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        if (n > 0) {
            System.out.println("The Number is Positive");
        } else {
            System.out.println("The Number is Negative");
        }
    }
}
