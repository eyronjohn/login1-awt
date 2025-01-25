package src;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Dashboard {

    public void display(){
        Frame dashboard = new Frame("Dashboard");
        Label welcome = new Label("Welcome back!");
        welcome.setBounds(50, 40, 150, 40);
        welcome.setFont(new Font("Times New Roman", Font.PLAIN, 14));

        dashboard.add(welcome);
        dashboard.setSize(320, 330);
        dashboard.setLayout(null);
        dashboard.setVisible(true);
        dashboard.setLocationRelativeTo(null);

        //allows the program to be terminated
        dashboard.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
