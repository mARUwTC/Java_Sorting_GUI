import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sorting extends JFrame{

    private JLabel title, text1, text2, text3;
    private JTextField box1, box2, box3;
    private JButton sort, reset;

    public Sorting() {
        super("Number Ascending");
        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        //title
        title = new JLabel("Sort the intrgers in ascending order");
        title.setToolTipText("");
        con.add(title);
        //main
        text1 = new JLabel("1st intrger: ");
        box1 = new JTextField("",10);
        con.add(text1);
        con.add(box1);
        text2 = new JLabel("2nd intrger: ");
        box2 = new JTextField("",10);
        con.add(text2);
        con.add(box2);
        text3 = new JLabel("3rd intrger: ");
        box3 = new JTextField("",10);
        con.add(text3);
        con.add(box3);
        //button
        sort = new JButton("Sort");
        reset = new JButton("Reset");
        con.add(sort, reset);
        con.add(reset);

        //ActionEvent
        reset.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                box1.setText(null);
                box2.setText(null);
                box3.setText(null);
            }
        });
        sort.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = box1.getText();
                int x = Integer.parseInt(num1);
                String num2 = box2.getText();
                int y = Integer.parseInt(num2);
                String num3 = box3.getText();
                int z = Integer.parseInt(num3);
                if ( x < y && y < z ){
                    box1.setText(String.valueOf(x));
                    box2.setText(String.valueOf(y));
                    box3.setText(String.valueOf(z));
                }
                else if ( x > y && y > z ){
                    box1.setText(String.valueOf(z));
                    box2.setText(String.valueOf(y));
                    box3.setText(String.valueOf(x));
                }
                else if ( x < y && x < z && y > z ){
                    box1.setText(String.valueOf(x));
                    box2.setText(String.valueOf(z));
                    box3.setText(String.valueOf(y));
                }
                else if ( x < y && x > z ){
                    box1.setText(String.valueOf(z));
                    box2.setText(String.valueOf(x));
                    box3.setText(String.valueOf(y));
                }
                else if ( x > y && x < z ){
                    box1.setText(String.valueOf(y));
                    box2.setText(String.valueOf(x));
                    box3.setText(String.valueOf(z));
                }
                else if ( x > y && x > z && y < z ){
                    box1.setText(String.valueOf(y));
                    box2.setText(String.valueOf(z));
                    box3.setText(String.valueOf(x));
                }
            }
        });
        //End of ActionEvent

        setSize(250, 180);
        setVisible(true);
    }

    public static void main(String[] arg){
        Sorting app = new Sorting();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
