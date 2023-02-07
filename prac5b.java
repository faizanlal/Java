
import java.util.*;

class prac5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = Integer.toString(sc.nextInt());
        int i = 0;
        while (i < number.length()) {
            System.out.println(number.charAt(i));
            i++;
        }
    }
}