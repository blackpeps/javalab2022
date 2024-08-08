import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TrafficLight extends JPanel implements ActionListener {
    private JRadioButton r1, r2, r3;
    private Color red_c, green_c, orange_c;
    public TrafficLight() {
        setBounds(0,0,600,480);
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Orange");
        r3 = new JRadioButton("Green");
        ButtonGroup group = new ButtonGroup();
        r1.setSelected(false);
        group.add(r1);group.add(r2);group.add(r3);
        add(r1);add(r2);add(r3);
        red_c = getBackground();
        green_c = getBackground();
        orange_c = getBackground();
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(r1.isSelected() == true) {
            red_c = Color.red;
            green_c = getBackground();
            orange_c = getBackground();
        }
        else if(r2.isSelected() == true) {
            red_c = getBackground();
            green_c = getBackground();
            orange_c = Color.orange;
        }
        else if(r3.isSelected() == true) {
            red_c = getBackground();
            green_c = Color.green;
            orange_c = getBackground();
        }
        repaint();
    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        g.drawOval(50,50,50,50);
        g.drawOval(50,110,50,50);
        g.drawOval(50,170,50,50);
        g.setColor(red_c);
        g.fillOval(50,50,50,50);
        g.setColor(orange_c);
        g.fillOval(50,110,50,50);
        g.setColor(green_c);
        g.fillOval(50,170,50,50);
    }
}
public class Test {
    public static void main(String args[]) {
        JFrame f1 = new JFrame();
        f1.setVisible(true);
        f1.setSize(600,480);
        f1.setLayout(null);
        TrafficLight t = new TrafficLight();
        f1.add(t);
    }
}
