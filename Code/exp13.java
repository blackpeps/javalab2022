import javax.swing.*;
import java.awt.event.*;
class calulator extends JFrame implements ActionListener {
    private JTextField t1;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b17;
    private JButton b9, b10, b11, b12, b13, b14, b15, b16;
    private Integer res;
    private String operation;
    public calulator () {
        setLayout(null);
        setSize(240,250);
        setTitle("Calculator");
        t1 = new JTextField();
        t1.setBounds(10,10,200,30);
        b1 = new JButton("1");
        b1.setBounds(10,50,50,30);
        b2 = new JButton("2");
        b2.setBounds(60,50,50,30);
        b3 = new JButton("3");
        b3.setBounds(110,50,50,30);
        b4 = new JButton("+");
        b4.setBounds(160,50,50,30);
        b5 = new JButton("4");
        b5.setBounds(10,80,50,30);
        b6 = new JButton("5");
        b6.setBounds(60,80,50,30);
        b7 = new JButton("6");
        b7.setBounds(110,80,50,30);
        b8 = new JButton("-");
        b8.setBounds(160,80,50,30);
        b9 = new JButton("7");
        b9.setBounds(10,110,50,30);
        b10 = new JButton("8");
        b10.setBounds(60,110,50,30);
        b11 = new JButton("9");
        b11.setBounds(110,110,50,30);
        b12 = new JButton("*");
        b12.setBounds(160,110,50,30);
        b17 = new JButton("0");
        b17.setBounds(10,140,50,30);
        b13 = new JButton("/");
        b13.setBounds(60,140,50,30);
        b14 = new JButton("%");
        b14.setBounds(110,140,50,30);
        b15 = new JButton("=");
        b15.setBounds(160,140,50,30);
        b16 = new JButton("C");
        b16.setBounds(10,170,200,30);
        add(t1);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
        add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);
        add(b14);add(b15);add(b16);add(b17);
        b1.addActionListener(this);b2.addActionListener(this);
        b3.addActionListener(this);b4.addActionListener(this);
        b5.addActionListener(this);b6.addActionListener(this);
        b7.addActionListener(this);b8.addActionListener(this);
        b9.addActionListener(this);b10.addActionListener(this);
        b11.addActionListener(this);b12.addActionListener(this);
        b13.addActionListener(this);b14.addActionListener(this);
        b15.addActionListener(this);b16.addActionListener(this);
        b17.addActionListener(this);
    }
    public void doAction(String op) {
        if(operation == null) {
            operation = op;
            res = Integer.parseInt(t1.getText());
            t1.setText("");
        }
        else {
            switch (operation) {
                case "+":   res = res + Integer.parseInt(t1.getText());
                    break;
                case "-":   res = res - Integer.parseInt(t1.getText());
                    break;
                case "/":   try {
                    if(t1.getText().equals("0")) {
                        throw new ArithmeticException("Divide by Zero");
                    }
                    res = res / Integer.parseInt(t1.getText());
                }
                catch (ArithmeticException e) {
                    t1.setText(e.getMessage());
                    operation = null;
                    res = 0;
                }
                    break;
                case "*":   res = res * Integer.parseInt(t1.getText());
                    break;
                case "%":   res = res % Integer.parseInt(t1.getText());
                    break;
                default:    res = 0;
                    break;
            }
            if (op.equals("=")) {
                t1.setText(res.toString());
                res = 0;
                operation = null;
            }
            else {
                operation = op;
                t1.setText("");
            }
        }
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1)
            t1.setText(t1.getText() + "1");
        else if(e.getSource() == b2)
            t1.setText(t1.getText() + "2");
        else if(e.getSource() == b3)
            t1.setText(t1.getText() + "3");
        else if(e.getSource() == b5)
            t1.setText(t1.getText() + "4");
        else if(e.getSource() == b6)
            t1.setText(t1.getText() + "5");
        else if(e.getSource() == b7)
            t1.setText(t1.getText() + "6");
        else if(e.getSource() == b9)
            t1.setText(t1.getText() + "7");
        else if(e.getSource() == b10)
            t1.setText(t1.getText() + "8");
        else if(e.getSource() == b11)
            t1.setText(t1.getText() + "9");
        else if(e.getSource() == b17)
            t1.setText(t1.getText() + "0");
        else if(e.getSource() == b16) {
            t1.setText("");
            res = 0;
            operation = null;
        }
        else if (e.getSource() == b4) {
            if(t1.getText().equals(""))
                res = 0;
            else
                doAction("+");
        }
        else if (e.getSource() == b8)
            if(t1.getText().equals(""))
                res = 0;
            else
                doAction("-");
        else if (e.getSource() == b12)
            if(t1.getText().equals(""))
                res = 0;
            else
                doAction("*");
        else if (e.getSource() == b13)
            if(t1.getText().equals(""))
                res = 0;
            else
                doAction("/");
        else if (e.getSource() == b14)
            if(t1.getText().equals(""))
                res = 0;
            else
                doAction("%");
        else if (e.getSource() == b15)
            if(t1.getText().equals(""))
                res = 0;
            else
                doAction("=");
    }
}
public class Test {
    public static void main (String args[]) {
        new calulator().setVisible(true);
    }
}