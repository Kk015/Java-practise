package OOPS;

public class BasicOOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();// created pen object called pen1
        pen1.setColor("Red");
        System.out.println(pen1.color);
        pen1.setTip(34);
        System.out.println(pen1.tip);

        BankAccount k1 = new BankAccount();
        BankAccount k2 = new BankAccount();
        k1.username = "Kunal";
        k1.setPass("frefde");
        k1.getPass();

    }
}

class BankAccount {
    public String username;
    private String password;

    void setPass(String password) {
        this.password = password;
    }

    void getPass() {
        System.out.println(this.password);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
