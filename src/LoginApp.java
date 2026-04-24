import javax.swing.*;
import java.awt.event.*;

public class LoginApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login System");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Username label
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 40, 100, 25);
        frame.add(userLabel);

        // Username field
        JTextField userText = new JTextField();
        userText.setBounds(120, 40, 150, 25);
        frame.add(userText);

        // Password label
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 80, 100, 25);
        frame.add(passLabel);

        // Password field
        JPasswordField passText = new JPasswordField();
        passText.setBounds(120, 80, 150, 25);
        frame.add(passText);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 120, 100, 30);
        frame.add(loginButton);

        // Message label
        JLabel message = new JLabel("");
        message.setBounds(50, 160, 250, 25);
        frame.add(message);

        // Action (Login logic)
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = userText.getText();
                String password = new String(passText.getPassword());

                // Simple validation
                if(username.equals("admin") && password.equals("1234")) {
                    message.setText("Login Successful!");
                } else {
                    message.setText("Invalid Username or Password");
                }
            }
        });

        frame.setVisible(true);
    }
}