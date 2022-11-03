import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimerTask;
import java.util.Timer;

public class Board extends JPanel{
    private ArrayList<Shape> board = new ArrayList();
    Timer scoreTimer = new Timer();
    Timer blockFallTimer = new Timer();

    private int blockFallTimerSpeed = 1000;

    public Board() {
        this.setBackground(Color.BLACK);
        loadTimers();
        summonBlock();
    }

    public void loadTimers() {
        scoreTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < board.size(); i++) {

                }
            }
        }, 0,1000);
        blockFallTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < board.size(); i++) {
                    board.get(i).setFallTick(board.get(i).getFallTick() + 1);
                    repaint();
                }
            }
        }, 0,blockFallTimerSpeed);

    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawLines(g);
    }
    public void drawLines(Graphics g) {
        int c = 0;

        for (int i = 0; i < 800; i+=400/10) {
            if (i <= 400)
                g.drawLine(i,0,i ,800);
            g.drawLine(0 ,i,400,i);
        }
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.get(i).getShapeType().getCoordsTable().length; j++) {
                g.fillRect(40 * board.get(i).getShapeType().getCoordsTable()[j][0] + 80 ,(40 * board.get(i).getShapeType().getCoordsTable()[j][1] + (40 *  board.get(i).getFallTick())),40,40);
            }
        }

    }
    public void summonBlock() {
        Shape shape = new Shape(Color.PINK,ShapeType.TShape);
        board.add(shape);
        //
    }



}
