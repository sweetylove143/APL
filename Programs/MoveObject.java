import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveObject extends JPanel implements ActionListener {
    private int x = 150, y = 150;          // Initial coordinates of the object
    private final int width = 150;         // Width of the square (150)
    private final int height = 150;        // Height of the square (150)
    private final int moveDistance = 30;   // Increased distance to move (30)

    // Constructor for setting up the GUI components
    public MoveObject() {
        // Creating buttons for each direction
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        // Adding ActionListeners for each button
        upButton.addActionListener(this);
        downButton.addActionListener(this);
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);

        // Adding buttons to a JPanel for layout organization
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);

        // Setting up the main JFrame
        JFrame frame = new JFrame("Move Object");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this, BorderLayout.CENTER);  // Adding main drawing panel
        frame.add(buttonPanel, BorderLayout.SOUTH);  // Adding buttons at the bottom
        frame.setVisible(true);
    }

    // Overriding paintComponent to draw the object
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);  // Drawing the object as a scaled-up rectangle
    }

    // Handling button click actions
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Adjusting coordinates based on button clicked
        switch (command) {
            case "Up" -> y = Math.max(y - moveDistance, 0);
            case "Down" -> y = Math.min(y + moveDistance, getHeight() - height);
            case "Left" -> x = Math.max(x - moveDistance, 0);
            case "Right" -> x = Math.min(x + moveDistance, getWidth() - width);
        }

        // Repainting the panel to update the object's position
        repaint();
    }

    // Main method to run the program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MoveObject::new);
    }
}
