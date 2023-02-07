import java.util.*;

public class prac6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a(sc);

        // b(sc);

        // c(sc);

        // pr1(sc);

        pr2(sc);

    }

    private static void pr2(Scanner sc) {
        System.out.print("Enter Length of Array:");
        int len = sc.nextInt();
        int A[], i;
        A = new int[len];

        for (i = 0; i < len; i++) {
            System.out.print("Enter Element:");
            A[i] = sc.nextInt();
        }

        for (i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = 0;

                if (A[i] > A[j]) {
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }

        System.out.println("Second Largest is " + A[len - 1]);
    }

    static void pr1(Scanner sc) {
        System.out.print("Enter Length of Array:");
        int len = sc.nextInt();
        int A[], i;
        A = new int[len];

        for (i = 0; i < len; i++) {
            System.out.print("Enter Element:");
            A[i] = sc.nextInt();
        }
        System.out.print("Enter Element to be Searched:");
        int E = sc.nextInt();

        for (i = 0; i < len; i++) {
            if (A[i] == E) {
                System.out.println("Index of " + E + " is " + i);
                break;
            }
        }
    }

    static void c(Scanner sc) {
        System.out.print("Enter Length of Array:");
        int len = sc.nextInt();
        int A[], i;
        A = new int[len];

        for (i = 0; i < len; i++) {
            System.out.print("Enter Element:");
            A[i] = sc.nextInt();
        }

        for (i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int tmp = 0;

                if (A[i] > A[j]) {
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;import java.util.*;  public class prac6 {     public static void main(String[] args) {         Scanner sc = new Scanner(System.in);         // a(sc);          // b(sc);          // c(sc);          // pr1(sc);          pr2(sc);      }      private static void pr2(Scanner sc) {         System.out.print("Enter Length of Array:");         int len = sc.nextInt();         int A[], i;         A = new int[len];          for (i = 0; i < len; i++) {             System.out.print("Enter Element:");             A[i] = sc.nextInt();         }          for (i = 0; i < len; i++) {             for (int j = i + 1; j < len; j++) {                 int tmp = 0;                  if (A[i] > A[j]) {                     tmp = A[i];                     A[i] = A[j];                     A[j] = tmp;                 }             }         }          System.out.println("Second Largest is " + A[len - 1]);     }      static void pr1(Scanner sc) {         System.out.print("Enter Length of Array:");         int len = sc.nextInt();         int A[], i;         A = new int[len];          for (i = 0; i < len; i++) {             System.out.print("Enter Element:");             A[i] = sc.nextInt();         }         System.out.print("Enter Element to be Searched:");         int E = sc.nextInt();          for (i = 0; i < len; i++) {             if (A[i] == E) {                 System.out.println("Index of " + E + " is " + i);                 break;             }         }     }      static void c(Scanner sc) {         System.out.print("Enter Length of Array:");         int len = sc.nextInt();         int A[], i;         A = new int[len];          for (i = 0; i < len; i++) {             System.out.print("Enter Element:");             A[i] = sc.nextInt();         }          for (i = 0; i < len; i++) {             for (int j = i + 1; j < len; j++) {                 int tmp = 0;                  if (A[i] > A[j]) {                     tmp = A[i];                     A[i] = A[j];                     A[j] = tmp;                 }             }         }          System.out.print("Array in ascending order is:");         for (i = 0; i < len; i++) {             System.out.print(A[i] + ",");         }     }      static void b(Scanner sc) {         System.out.print("Enter Length of Array:");         int len = sc.nextInt();         int A[], i, c = 0;         A = new int[len];          for (i = 0; i < len; i++) {             System.out.print("Enter Element:");             A[i] = sc.nextInt();         }         System.out.print("Even Elements in Array:");         for (i = 0; i < len; i++) {             if (A[i] % 2 == 0) {                 System.out.print(A[i] + ",");                 c++;             }         }         System.out.println("Total Evens Numbers Are:" + c);     }      static void a(Scanner sc) {         System.out.print("Enter Length of Array:");         int len = sc.nextInt();         int A[], B[], i;         A = new int[len];         B = new int[len];          for (i = 0; i < len; i++) {             System.out.print("Enter Element:");             A[i] = sc.nextInt();             B[i] = A[i];         }         System.out.println("B-Array");         for (i = 0; i < len; i++) {             System.out.println(i + ":-" + B[i]);         }     } }
                }
            }
        }

        System.out.print("Array in ascending order is:");
        for (i = 0; i < len; i++) {
            System.out.print(A[i] + ",");
        }
    }

    static void b(Scanner sc) {
        System.out.print("Enter Length of Array:");
        int len = sc.nextInt();
        int A[], i, c = 0;
        A = new int[len];

        for (i = 0; i < len; i++) {
            System.out.print("Enter Element:");
            A[i] = sc.nextInt();
        }
        System.out.print("Even Elements in Array:");
        for (i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                System.out.print(A[i] + ",");
                c++;
            }
        }
        System.out.println("Total Evens Numbers Are:" + c);
    }

    static void a(Scanner sc) {
        System.out.print("Enter Length of Array:");
        int len = sc.nextInt();
        int A[], B[], i;
        A = new int[len];
        B = new int[len];

        for (i = 0; i < len; i++) {
            System.out.print("Enter Element:");
            A[i] = sc.nextInt();
            B[i] = A[i];
        }
        System.out.println("B-Array");
        for (i = 0; i < len; i++) {
            System.out.println(i + ":-" + B[i]);
        }
    }
}
