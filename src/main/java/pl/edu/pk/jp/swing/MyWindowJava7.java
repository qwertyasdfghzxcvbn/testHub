package pl.edu.pk.jp.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MyWindowJava7 extends JFrame {

private static final long serialVersionUID = 1L;

private JTextField path;

public String getName() {
    return path.getText();
}

	public MyWindowJava7(String text) {
        super("My Window");
        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MyWindowJava7.this.setVisible(false);
                MyWindowJava7.this.dispose();
            }
        });
        
        path = new JTextField("åcieøka do folderu");

        final JButton btn = new JButton(text);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MyWindowJava7.this, getName(), "Hey", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        final JButton btn2 = new JButton("Zatwierdü");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MyWindowJava7.this, path.getText(), "Hejej", JOptionPane.INFORMATION_MESSAGE);
            }
        });
             
        setLayout(new FlowLayout());
        add(btn);
        add(btn2);
        add(path);
        pack();
    }
}
