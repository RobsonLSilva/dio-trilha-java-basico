import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoginAppGUI app = new LoginAppGUI();
        SwingUtilities.invokeLater(() -> app.createAndShowGUI());
    }
}
