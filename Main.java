public class Main {
    public static void main(String[] args) {
        Student k1 = new Student();
        Student k2 = new Student("Rama");
        Student k3 = new Student("Kunal", 345);
        System.out.println(k3.Name);
    }
}

class Student {
    int Rollno;
    String Name;

    Student() {
        System.out.println("Construtor called"); // Non Parametrized Constructor
    }

    Student(String Name) {
        this.Name = Name;
        System.out.println("No Rollno. is intialized");
    }

    Student(String Name, int Rollno) { // Parametrized Construtor
        this.Name = Name;
        this.Rollno = Rollno;
    }
}