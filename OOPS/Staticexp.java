package OOPS;

public class Staticexp {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Schoolname = "KV Public";
        Student s2 = new Student();
        System.out.println(s2.Schoolname);
        System.out.println(Student.Schoolname);

    }
}

class Student {
    String name;
    int Rollno;
    static String Schoolname; // This will be same for all the objects created

    static int avgMarks(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}