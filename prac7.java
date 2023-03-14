import java.util.*;

public class prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a(sc);

        // b(sc);

        // c(sc);

        d(sc);

    }

    static void d(Scanner sc) {
        System.out.print("Enter a String:");
        char[] str = sc.nextLine().toCharArray();

        Arrays.sort(str);

        System.out.println("Sorted String:" + new String(str));
    }

    static void c(Scanner sc) {
        String str;
        String rev = "";

        System.out.print("Enter a String:");
        str = sc.nextLine().toLowerCase();
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            char d = str.charAt(i);
            rev += d;
        }

        if (str.equals(rev)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }

    static void b(Scanner sc) {
        String str;
        int c = 0;

        System.out.print("Enter a String:");
        str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                c++;
            }
        }
        System.out.println("No. of Vowels present in string are " + c);
    }

    static void a(Scanner sc) {
        String str;

        System.out.print("Enter a String:");
        str = sc.nextLine();
        // Using Length Function
        System.out.println("Length:" + str.length());
    }
}
