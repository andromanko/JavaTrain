import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class test1 {
    private JPanel jpanel1;
    private JButton button1;
    private JTextField textField1;

    public JTextArea getTextArea1() {
        return textArea1;
    }

    static JTextArea textArea1;
    private JTextPane textPane1;
    Integer i=13;
    static JTextField textfield1, textfield2, textfield3;

//    test1() {
        //this.init();
//        this.button1.getUI();
  //  jpanel1.getGraphics();

    public test1() {
        button1.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent actionEvent) {
                i++;
                String si = i.toString();
                textArea1.append(si);
            }
        });
        //


    } //constructor

 /*   public static void valOut(Integer val1,Integer val2) {
        textArea1.append("val1=" + val1 + " val2=" + val2);
    }*/

    public static void main() {
        JFrame frame = new JFrame("test1");
        //Dimension dimension = ;
        frame.setPreferredSize(new Dimension(400,150));
        frame.setBounds(100,100,200,50);
        frame.setContentPane(new test1().jpanel1);
        //jpanel1.setBounds(200,200,150,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //this.textArea1.setText("qweqasdf");
        //textArea1.append("qwe");
        frame.getContentPane().setLayout(new FlowLayout());
        textfield1 = new JTextField("Text field 1",10);
        textfield2 = new JTextField("Text field 2",10);
        textfield3 = new JTextField("Text field 3",10);
        frame.getContentPane().add(textfield1);
        frame.getContentPane().add(textfield2);
        frame.getContentPane().add(textfield3);

        frame.pack();
        frame.setVisible(true);
        textfield1.setText("asdasd");
    }




    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
