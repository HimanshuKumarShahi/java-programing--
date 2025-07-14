import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalDetailsForm extends JFrame implements ActionListener {

    // Components
    private JTextField nameField, ageField, heightField, addressField, phoneField;
    private JComboBox<String> genderBox;
    private JButton submitButton;
    private JTextArea outputArea;

    public PersonalDetailsForm() {
        setTitle("Personal Details Form");
        setSize(400, 500);
        setLayout(new GridLayout(8, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(230, 245, 255));

        Font font = new Font("Arial", Font.PLAIN, 16);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(font);
        nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setFont(font);
        ageField = new JTextField();

        JLabel heightLabel = new JLabel("Height (cm):");
        heightLabel.setFont(font);
        heightField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(font);
        genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setFont(font);
        addressField = new JTextField();

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setFont(font);
        phoneField = new JTextField();

        submitButton = new JButton("Submit Details");
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));
        submitButton.addActionListener(this);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        outputArea.setBackground(Color.WHITE);

        // Add components to frame
        add(nameLabel);    add(nameField);
        add(ageLabel);     add(ageField);
        add(heightLabel);  add(heightField);
        add(genderLabel);  add(genderBox);
        add(addressLabel); add(addressField);
        add(phoneLabel);   add(phoneField);
        add(submitButton); add(new JLabel("")); // empty label for spacing
        add(new JLabel("Details Preview:")); 
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String age = ageField.getText();
        String height = heightField.getText();
        String gender = (String) genderBox.getSelectedItem();
        String address = addressField.getText();
        String phone = phoneField.getText();

        String details = "📄 Personal Details 📄\n"
                + "---------------------------\n"
                + "👤 Name    : " + name + "\n"
                + "🎂 Age     : " + age + " years\n"
                + "📏 Height  : " + height + " cm\n"
                + "🚻 Gender  : " + gender + "\n"
                + "🏠 Address : " + address + "\n"
                + "📞 Phone   : " + phone + "\n";

        outputArea.setText(details);
    }

    public static void main(String[] args) {
        new PersonalDetailsForm();
    }
}
