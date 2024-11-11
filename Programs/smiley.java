
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class smiley extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley");

        frame.setSize(800, 800);
        frame.setBackground(Color.CYAN);
        smiley panel = new smiley();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);       //face
        g.drawArc(100, 100, 250, 250, 0, 360);
        g.fillArc(100, 100, 250, 250, 0, 360);

        g.setColor(Color.BLACK);        //eyes
        g.drawArc(170, 185, 25, 25, 0, 360);
        g.fillArc(170, 185, 25, 25, 0, 360);
        g.drawArc(255, 185, 25, 25, 0, 360);
        g.fillArc(255, 185, 25, 25, 0, 360);

        g.setColor(Color.yellow);
        g.drawOval(74, 180, 50, 80); // left ear
        g.fillOval(74, 180, 50, 80);
        g.drawOval(324, 180, 50, 80); // right ear
        g.fillOval(324, 180, 50, 80);

        g.setColor(Color.BLACK);
        g.drawArc(150, 215, 150, 100, 0, -180);     //mouth
    }
}
