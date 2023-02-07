import java.util.*;

public class prac3b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        if (n % 3 == 0) {
            System.out.println("The no. is divisible by 3");

        } else {
            System.out.println("The no. not is divisible by 3");
        }
    }
}