import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BusBookingApp extends JFrame implements ActionListener {

    private JComboBox<String> sourceBox, destinationBox;
    private JTextField dateField;
    private JComboBox<String> seatBox;
    private JButton bookButton;
    private JTextArea outputArea;

    public BusBookingApp() {
        
        setTitle("Bus Booking System Using Java Gui");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 5, 5));

        
        add(new JLabel("From:"));
        sourceBox = new JComboBox<>(new String[] {"Select", "Delhi", "Mumbai", "Bangalore", "Chennai"});
        add(sourceBox);

        add(new JLabel("To:"));
        destinationBox = new JComboBox<>(new String[] {"Select", "Delhi", "Mumbai", "Bangalore", "Chennai"});
        add(destinationBox);

        add(new JLabel("Date (dd-mm-yyyy):"));
        dateField = new JTextField();
        add(dateField);

        add(new JLabel("Seat Number:"));
        seatBox = new JComboBox<>();
        for (int i = 1; i <= 40; i++) {
            seatBox.addItem("Seat " + i);
        }
        add(seatBox);

        bookButton = new JButton("Book Ticket");
        bookButton.addActionListener(this);
        add(bookButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String from = (String) sourceBox.getSelectedItem();
        String to = (String) destinationBox.getSelectedItem();
        String date = dateField.getText();
        String seat = (String) seatBox.getSelectedItem();

        if (from.equals("Select") || to.equals("Select") || from.equals(to) || date.isEmpty()) {
            outputArea.setText("❗ Please enter valid booking details.");
        } else {
            outputArea.setText("✅ Ticket Booked Successfully!\n"
                    + "From: " + from + "\n"
                    + "To: " + to + "\n"
                    + "Date: " + date + "\n"
                    + "Seat: " + seat);
        }
    }

    public static void main(String[] args) {
        new BusBookingApp();
    }
}
