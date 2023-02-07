import java.util.*;

public class prac5a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("Enter a number:");
        n = sc.nextInt();
        System.out.print("Ascending:");
        for (i = 1; i <= n; i++) {
            System.out.print(i);
        }
        System.out.print("\nDescending:");
        for (i = n; i > 0; i--) {
            System.out.print(i);
        }
    }
}