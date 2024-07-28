import javax.swing.*;
import java.awt.*;

public class LoginAppGUI {
    private static final UserService userService = new UserService();

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Login Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new CardLayout());

        JPanel loginPanel = new JPanel();
        JPanel registerPanel = new JPanel();

        setupLoginPanel(panel, loginPanel, registerPanel);
        setupRegisterPanel(panel, loginPanel, registerPanel);

        panel.add(loginPanel, "loginPanel");
        panel.add(registerPanel, "registerPanel");

        frame.add(panel);
        frame.setVisible(true);
    }

    private void setupLoginPanel(JPanel mainPanel, JPanel loginPanel, JPanel registerPanel) {
        loginPanel.setLayout(new GridLayout(4, 4));

        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField(20);

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());

            if (userService.authenticateUser(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        });

        registerButton.addActionListener(e -> {
            CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
            cardLayout.show(mainPanel, "registerPanel");
        });

        loginPanel.add(userLabel);
        loginPanel.add(userText);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordText);
        loginPanel.add(loginButton);
        loginPanel.add(registerButton);
    }

    private void setupRegisterPanel(JPanel mainPanel, JPanel loginPanel, JPanel registerPanel) {
        registerPanel.setLayout(new GridLayout(4, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField(20);

        JButton registerButton = new JButton("Register");
        JButton backButton = new JButton("Back");

        registerButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());

            if (userService.registerUser(username, password)) {
                JOptionPane.showMessageDialog(null, "Registration successful!");
                CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
                cardLayout.show(mainPanel, "loginPanel");
            } else {
                JOptionPane.showMessageDialog(null, "Username already exists. Please choose another.");
            }
        });

        backButton.addActionListener(e -> {
            CardLayout cardLayout = (CardLayout) mainPanel.getLayout();
            cardLayout.show(mainPanel, "loginPanel");
        });

        registerPanel.add(userLabel);
        registerPanel.add(userText);
        registerPanel.add(passwordLabel);
        registerPanel.add(passwordText);
        registerPanel.add(registerButton);
        registerPanel.add(backButton);
    }
}
