import java.util.*;

class Trip {
    String source, dest;
    String startDate;
    int noOfDays;

    Trip(String s, String d, int nod, String sd) {
        source = s;
        dest = d;
        startDate = sd;
        noOfDays = nod;
    }

    static Trip bookNow(String s, String d, int nod, String da) {
        Trip trip = new Trip(s, d, nod, da);
        return trip;
    }

    void showDetails() {
        System.out.println("From:" + source);
        System.out.println("To:" + dest);
        System.out.println("On:" + startDate);
        System.out.println("No of Days:" + noOfDays);
    }

}

public class prac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Source:");
        String source = sc.nextLine();
        System.out.print("Enter Destination:");
        String dest = sc.nextLine();
        System.out.print("Enter Start Date:");
        String sd = sc.nextLine();
        System.out.print("Enter No of Days:");
        int days = sc.nextInt();

        System.out.println("");
        Trip t1 = new Trip(source, dest, days, sd);
        t1.showDetails();
    }
}
