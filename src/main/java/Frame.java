import javax.swing.*;

public class Frame extends JFrame {
    Board board = new Board();
    public Frame() {
        this.setBounds(300,100,400,800);
        this.setVisible(true);

        this.add(board);
        //
    }

    public static void main(String[] args) {
        new Frame();
    }
}
