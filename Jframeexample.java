import javax.swing.JFrame;

public class Jframeexample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Jframe title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
