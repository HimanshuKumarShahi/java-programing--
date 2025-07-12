import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;

public class BusBookingApp extends JFrame implements ActionListener {

    private JComboBox<String> sourceBox, destinationBox, seatBox;
    private JTextField dateField;
    private JButton bookButton, resetButton;
    private JTextArea outputArea;

    private Set<String> bookedSeats = new HashSet<>();

    public BusBookingApp() {
        setTitle("🚌 Bus Booking System");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new JLabel("From:"));
        sourceBox = new JComboBox<>(new String[]{"Select", "Delhi", "Mumbai", "Bangalore", "Chennai"});
        add(sourceBox);

        add(new JLabel("To:"));
        destinationBox = new JComboBox<>(new String[]{"Select", "Delhi", "Mumbai", "Bangalore", "Chennai"});
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

        resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> resetForm());
        add(resetButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        add(new JLabel("Booking Details:"));
        add(new JScrollPane(outputArea));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String from = (String) sourceBox.getSelectedItem();
        String to = (String) destinationBox.getSelectedItem();
        String date = dateField.getText().trim();
        String seat = (String) seatBox.getSelectedItem();

        if (from.equals("Select") || to.equals("Select") || from.equals(to)) {
            outputArea.setText("❗ Please select valid and different source and destination.");
            return;
        }

        if (!date.matches("\\d{2}-\\d{2}-\\d{4}")) {
            outputArea.setText("❗ Date must be in dd-mm-yyyy format.");
            return;
        }

        if (bookedSeats.contains(seat)) {
            outputArea.setText("❗ Seat " + seat + " is already booked. Please select another seat.");
            return;
        }

        int price = 500 + (int) (Math.random() * 500);
        bookedSeats.add(seat);

        outputArea.setText("✅ Ticket Booked Successfully!\n"
                + "----------------------------------\n"
                + "From       : " + from + "\n"
                + "To         : " + to + "\n"
                + "Date       : " + date + "\n"
                + "Seat No.   : " + seat + "\n"
                + "Price      : ₹" + price + "\n"
                + "----------------------------------\n"
                + "Thank you for booking with us!\n\n"
                + "🌐 To track your bus, please visit:\n"
                + "www.trackyourbus.com");
    }

    private void resetForm() {
        sourceBox.setSelectedIndex(0);
        destinationBox.setSelectedIndex(0);
        dateField.setText("");
        seatBox.setSelectedIndex(0);
        outputArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BusBookingApp::new);
    }
}
