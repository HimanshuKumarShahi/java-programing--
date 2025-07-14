import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;

public class PersonalDetailsGUI {
    public static void main(String[] args) {
        // Set font for a better look
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 14));

        // Collecting data through dialogs
        String name = JOptionPane.showInputDialog(null, "Enter Your Name:", "Personal Details", JOptionPane.QUESTION_MESSAGE);
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Age:", "Personal Details", JOptionPane.QUESTION_MESSAGE));
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Your Height (in cm):", "Personal Details", JOptionPane.QUESTION_MESSAGE));
        String gender = JOptionPane.showInputDialog(null, "Enter Your Gender (Male/Female/Other):", "Personal Details", JOptionPane.QUESTION_MESSAGE);
        String address = JOptionPane.showInputDialog(null, "Enter Your Address:", "Personal Details", JOptionPane.QUESTION_MESSAGE);
        String phone = JOptionPane.showInputDialog(null, "Enter Your Phone Number:", "Personal Details", JOptionPane.QUESTION_MESSAGE);

        // Formatting output
        String message = String.format(
            "📋 Your Personal Details 📋\n" +
            "---------------------------\n" +
            "👤 Name   : %s\n" +
            "🎂 Age    : %d years\n" +
            "📏 Height : %.1f cm\n" +
            "🚻 Gender : %s\n" +
            "🏠 Address: %s\n" +
            "📞 Phone  : %s",
            name, age, height, gender, address, phone
        );

        // Showing all collected data
        JOptionPane.showMessageDialog(null, message, "Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }
}
