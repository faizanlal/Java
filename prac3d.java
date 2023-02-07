import java.util.*;

class prac3d {
    public static void main(String[] args) {
        int age1 = 20;
        int age2 = 45;
        int age3 = 67;

        int oldest = age1;
        int youngest = age1;

        if (age2 > oldest) {
            oldest = age2;
        }
        if (age3 > oldest) {
            oldest = age3;
        }

        if (age2 < youngest) {
            youngest = age2;
        }
        if (age3 < youngest) {
            youngest = age3;
        }
        System.out.println("The oldest person is " + oldest + " years old.");
        System.out.println("The youngest person is " + youngest + " years old.");
    }
}// assume the youngest is the first person