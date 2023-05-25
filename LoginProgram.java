import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginProgram extends JFrame implements ActionListener {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public LoginProgram() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the labels
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");

        // Create the text fields
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        // Create the buttons
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");

        // Set layout manager
        setLayout(new GridLayout(3, 2));

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(cancelButton);

        // Add action listeners to the buttons
        loginButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Perform login validation
            if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
            }
        } else if (e.getSource() == cancelButton) {
            // Clear the fields
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginProgram loginProgram = new LoginProgram();
            loginProgram.setVisible(true);
        });
    }
}
