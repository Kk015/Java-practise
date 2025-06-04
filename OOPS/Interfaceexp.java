package OOPS;

public class Interfaceexp {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.move();
        // King k = new King();
        // k.move();

        Bear bhalu = new Bear();
        bhalu.both();
    }
}

interface Eating {
    void eat();
}

interface Drinking {
    void drink();
}

class Bear implements Eating, Drinking {
    public void eat() {
        System.out.println("Eating");
    }

    public void drink() {
        System.out.println("Drinking");
    }

    void both() {
        eat();
        drink();

    }
}

interface Chessplayer {
    void move();
}

class Queen implements Chessplayer {
    public void move() {
        System.out.println("queen moves");
    }
}

class King implements Chessplayer {
    public void move() {
        System.out.println("King moves");
    }
}