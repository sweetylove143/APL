import java.awt.*; 
import java.awt.event.*; 

public class Move extends Frame implements ActionListener { 
    Button up = new Button("Up"); 
    Button down = new Button("Down"); 
    Button right = new Button("Right"); 
    Button left = new Button("Left"); 
    Button exit = new Button("Exit"); 
    int x = 200; 
    int y = 200; 
    Object s; 
    
    Move() { 
        setSize(500, 500); 
        setTitle("Move Object"); 
        setLayout(new FlowLayout()); 
        setBackground(Color.red); 
        add(up); 
        add(down); 
        add(right); 
        add(left); 
        add(exit); 
        up.addActionListener(this); 
        down.addActionListener(this); 
        right.addActionListener(this); 
        left.addActionListener(this); 
        exit.addActionListener(this); 
        
        // Handle close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    } 
    
    public void actionPerformed(ActionEvent ae) { 
        s = ae.getSource(); 
        repaint(); 
    } 
    
    public void paint(Graphics g) { 
        if (s == up) y = Math.max(0, y - 20); 
        else if (s == down) y = Math.min(getHeight() - 50, y + 20); 
        else if (s == right) x = Math.min(getWidth() - 50, x + 20); 
        else if (s == left) x = Math.max(0, x - 20); 
        else if (s == exit) System.exit(0); 
        
        g.drawRect(x, y, 50, 50); 
    } 
    
    public static void main(String args[]) { 
        Move m = new Move(); 
        m.setVisible(true); 
    } 
}
