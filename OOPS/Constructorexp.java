package OOPS;

import java.util.Arrays;

public class Constructorexp {
    public static void main(String[] args) {
        // Student k1 = new Student();
        // Student k2 = new Student("Rama");

        Student k3 = new Student("Kunal", 345);
        k3.pass = "abcd";
        k3.marks[0] = 23;
        k3.marks[1] = 54;
        k3.marks[2] = 98;

        Student s2 = new Student(k3); // Copy constructor
        s2.pass = "fdefd";

        k3.Name = "Lucy";
        k3.marks[2] = 34;

        // System.out.println(k3.Name);
        // s2.printprop();
        System.out.println(Arrays.toString(k3.marks));
        System.out.println(Arrays.toString(s2.marks));

    }
}

class Student {
    int Rollno;
    String Name;
    String pass;
    int marks[];

    void printprop() {
        System.out.println(this.Name);
        System.out.println(this.pass);

    }

    // Student(Student st) { // Shallow copy contructor
    // marks = new int[3];
    // this.pass = st.pass;
    // this.Name = st.Name;
    // this.marks = st.marks;
    // }

    Student(Student st) { // deep copy constructor
        marks = new int[3];
        this.pass = st.pass;
        this.Name = st.Name;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = st.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Construtor called"); // Non Parametrized Constructor
    }

    Student(String Name) {
        marks = new int[3];
        this.Name = Name;
        System.out.println("No Rollno. is intialized");
    }

    Student(String Name, int Rollno) { // Parametrized Construtor
        marks = new int[3];
        this.Name = Name;
        this.Rollno = Rollno;
    }
}

// Destructor are not present in java it is handeled automically through
// Garabage collection