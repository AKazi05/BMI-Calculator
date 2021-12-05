import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.Color;
public class BMICalculator implements ActionListener
{
    private static JLabel label;    
    private static JLabel label2;
    private static JLabel label3;
    private static JTextField userText;
    private static JTextField userText2;
    private static JButton jbUpper;
    private static JButton jbClear;
    private static JLabel converter;
    private static JLabel clear;
    private static double convert2;
    private static JButton convertB;
    private static JButton convertB2;
    private static double convert;
    private static int flag = 1;
    private static JPanel panel;
    private static JLabel error;
    private static JFrame frame;
    private static double bmi;

    public static void main(String[] args){

        panel = new JPanel();
        frame = new JFrame();
        frame.setSize (480,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setBackground(Color.gray);
        frame.setTitle("BMI Calculator");

        panel.setLayout(null);

        label = new JLabel("Weight:");
        label.setBounds(20, 80, 80, 25);
        panel.add(label);

        label2 = new JLabel("Height:");
        //left/right | up/down |
        label2.setBounds(20, 140, 80, 25);
        panel.add(label2);
        
        label3 = new JLabel("BMI:");
        label3.setBounds(30, 200, 80, 25);
        panel.add(label3);

        userText = new JTextField(100);
        userText.setBounds(80, 80, 350, 25);
        panel.add(userText);
        
        userText2 = new JTextField(100);
        userText2.setBounds(80, 140, 350, 25);
        panel.add(userText2);
        
        convertB = new JButton("calculate");
        convertB.setBounds(80, 250, 100, 25);
        convertB.addActionListener(new BMICalculator());
        panel.add(convertB);

        converter = new JLabel(" ");
        converter.setBounds(63, 200, 80, 25);
        panel.add(converter);

        convertB2 = new JButton("clear");
        convertB2.setBounds(280, 250, 100, 25);
        convertB2.addChangeListener(new ChangeListener(){
                @Override
                public void stateChanged(ChangeEvent e){
                    userText.setText("");
                    userText2.setText("");
                    converter.setText("");
                }
            });
        panel.add(convertB2);

        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            convert = Double.parseDouble(userText.getText());
            convert2 = Double.parseDouble(userText2.getText());
            bmi = ((convert/convert2/convert2)*703);
            converter.setText(Double.toString(bmi));      
        }
        catch(Exception d){
        }
    }
}

