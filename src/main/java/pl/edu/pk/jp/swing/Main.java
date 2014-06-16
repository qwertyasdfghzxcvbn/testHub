package pl.edu.pk.jp.swing;

import java.awt.FlowLayout;

import javax.swing.SwingUtilities;

// HowToBuild:
// mvn clean install

// HowToExecute from the console:
// cd <path-to-jar-file>
// java -jar swingGoodPracticeWindowJava7-0.0.1-SNAPSHOT.jar "Test"

public class Main {
    public static void main(String[] args) {
        final String text = args[0];
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                final MyWindowJava7 wnd = new MyWindowJava7(text);
                wnd.setSize(500, 300);
                wnd.setLocation(100,100);
                wnd.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
                wnd.setVisible(true);
            }
        });
    }
}
