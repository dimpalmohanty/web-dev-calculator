import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame{
    JLabel l1, l2;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    Calculator(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1= new JLabel("Simple Calculator");
        l1.setFont(new Font("Times New Roman",Font.BOLD,300));
        l1.setForeground(Color.BLUE);
        add(l1);

        t1 = new JTextField(60);
        t2 = new JTextField(60);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mul");
        b4 = new JButton("Div");

        t1 .setBounds(100, 60, 130, 30);
        t2.setBounds(100, 100, 120, 30);

        b1.setBounds(100, 140, 60, 30);
        b2.setBounds(160, 140, 60, 30);

        b3.setBounds(100, 180, 60, 30);
        b4.setBounds(160, 180, 60, 30);

        l2= new JLabel("");
        l2.setBounds(250, 80, 200, 30);
        

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        add(t2);

            b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Addition of two numbers"+(no1+no2));
                
            }
            
         });
         b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Substraction of two numbers"+(no1-no2));
                
            }
            
         });
         b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Multiplication  of two numbers"+(no1*no2));
                
            }
            
         });
         b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                l2.setText("Division of two numbers"+(no1/no2));
                
            }
            
         });
    }
}


class Simple2alculator{
  public static void main(String[] args){
        Calculator c = new Calculator();
        c.setBounds(400, 200, 400, 300);
        c.setVisible(true);
    }
}