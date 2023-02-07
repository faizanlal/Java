import java.util.*;

public class prac5d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int c = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Number is Prime.");
        } else {
            System.out.println("Number is Not Prime.");
        }
    }
}