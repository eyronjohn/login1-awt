import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login {

    //Log In: by Java AWT
    public static void main(String[] args) {

        //objects instantiation
        Frame frame = new Frame("Log In");
        Label email = new Label("Email");
        Label passW = new Label("Password");
        TextField eTf = new TextField();
        Checkbox cb = new Checkbox("Remember Me");
        Button b = new Button("Log In");
        JPasswordField pF = new JPasswordField();

        //positioning
        email.setBounds(50, 40, 50, 40);
        eTf.setBounds(50, 80, 180, 30);
        passW.setBounds(50, 110, 80, 50);
        pF.setBounds(50, 160, 180, 30);
        cb.setBounds(50, 205, 120, 25);
        b.setBounds(50, 235, 180, 35);

        //styling
        eTf.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        pF.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        email.setFont(new Font("Times New Roman", Font.BOLD, 15));
        passW.setFont(new Font("Times New Roman", Font.BOLD, 15));
        cb.setFont(new Font("Roboto", Font.PLAIN, 14));
        b.setFont(new Font("Roboto", Font.BOLD, 16));
        b.setForeground(Color.white);
        b.setBackground(Color.decode("#0D92F4"));

        //add objects
        frame.add(email);
        frame.add(passW);
        frame.add(pF);
        frame.add(eTf);
        frame.add(cb);
        frame.add(b);

        frame.setSize(320, 330);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //allows the program to be terminated
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }//main
}//class