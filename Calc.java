import java.awt.*;
import java.awt.event.*;

public class Calc{
    Frame f=new Frame("Calculator");
    Label l1=new Label("Number 1:");
    Label l2=new Label("Number 2:");
    Label l3=new Label("");
    TextField t1=new TextField();
    TextField t2=new TextField();
    Button b1=new Button("Add");
    Button b2=new Button("Subtract");
    public void start()
    {
        b1.setBounds(150,300,200,50);
        b2.setBounds(150,370,200,50);
        t1.setBounds(250,100,200,50);
        t2.setBounds(250,200,200,50);
        l1.setBounds(100,100,200,50);
        l2.setBounds(100,200,200,50);
        l3.setBounds(150,420,300,50);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.add(b1);
        f.add(b2);
        f.add(t1);
        f.add(t2);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        b1.addActionListener(new ButtonClickListener());
        b2.addActionListener(new ButtonClickListener());
    }
    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try
            {
            int r=-1;
            if(e.getActionCommand().equals("Add"))
                r=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
            else
                r=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
            l3.setText("The result is: "+r);
            }
            catch(NumberFormatException nfe)
            {
                if(t1.getText().equals("")||t2.getText().equals(""))
                    l3.setText("Please input two numbers");
                else
                    l3.setText("Please enter numbers in correct format");
            }
        }
    }
    public static void main(String args[])
    {
        Calc c=new Calc();
        c.start();
    }
}