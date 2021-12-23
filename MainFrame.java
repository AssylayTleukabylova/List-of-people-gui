package JavaCourse.gui.guiHomework1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainFrame extends JFrame {

    private final JButton button;
    private final JLabel label;
    private final JLabel label1;
    private final JTextField textField;
    private final JTextField textField1;
    private final JLabel label2;
    private final JComboBox agesBox;
    private final Integer[] ages = new Integer[100];
    private final JTextArea area;

    public MainFrame() {
        for(int i =0;i<100;i++){
            ages[i]= i;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Application");
        setSize(500,500);
        setLayout(null);

        label = new JLabel("Name:");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        textField = new JTextField();
        textField.setSize(300,30);
        textField.setLocation(150,100);
        add(textField);

        label1 = new JLabel("Phone:");
        label1.setSize(300,30);
        label1.setLocation(100,150);
        add(label1);

        textField1 = new JTextField();
        textField1.setSize(300,30);
        textField1.setLocation(150,150);
        add(textField1);

        label2 = new JLabel("Age:");
        label2.setSize(300,30);
        label2.setLocation(100,200);
        add(label2);

        agesBox = new JComboBox(ages); 
        agesBox.setSize(300,30);
        agesBox.setLocation(150,200);
        add(agesBox);

        area = new JTextArea();
        area.setSize(300,100);
        area.setLocation(100,300);
        add(area);

        button = new JButton("ADD CONTACT");
        button.setSize(300,30);
        button.setLocation(100,250);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = textField.getText();
                String phone=textField1.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if(!name.equals("")){
                    area.append(name+"-"+phone+"-"+age+" years"+"\n");

                    textField.setText("");
                    textField1.setText("");
                    agesBox.setSelectedIndex(0);
                }

            }
        });
        add(button);
    }

}


