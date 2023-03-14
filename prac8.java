
class Student {
    int studentId;
    String subjectCode;
    float marks;

    void getData(int sid, String subCode, float m) {
        studentId = sid;
        subjectCode = subCode;
        marks = m;
    }

    void putData() {
        System.out.println("Student Id:" + studentId);
        System.out.println("Subject Code:" + subjectCode);
        System.out.println("Marks:" + marks);
    }

}

class Person {
    int personId, age;
    String name;

    void getData(int pId, int a, String n) {
        personId = pId;
        age = a;
        name = n;
    }

    void ageGroup() {
        if (age < 8) {
            System.out.println("Child");
        } else if (age > 8 && age < 20) {
            System.out.println("Teenage");
        } else if (age >= 20 && age <= 40) {
            System.out.println("Young");
        } else {
            System.out.println("Old");
        }
    }

}

public class prac8 {
    public static void main(String[] args) {
        a();
        b();
    }

    private static void b() {
        Person p1 = new Person();
        p1.getData(01, 17, "Tejash");
        p1.ageGroup();
        System.out.println("");
        Person p2 = new Person();
        p2.getData(01, 5, "Usman");
        p2.ageGroup();
    }

    static void a() {
        Student s1 = new Student();
        s1.getData(24, "CE002", 432);
        s1.putData();
        System.out.println("");
        Student s2 = new Student();
        s2.getData(04, "CE007", 573);
        s2.putData();
    }
}
