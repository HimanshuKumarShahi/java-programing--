import javax.swing.JOptionPane;
public class heightgui {
    public static void main(String[] args) {
     String name=JOptionPane.showInputDialog("Enter your name please ?");
     double phnumber=Double.parseDouble(JOptionPane.showInputDialog("Enter your mobile number ?"));
     int age=Integer.parseInt(JOptionPane.showInputDialog("Kindly ! Enter your age please?"));
     JOptionPane.showConfirmDialog(null,"Your Name is:-" + name);
     JOptionPane.showConfirmDialog(null,"Your phone number is:-" + phnumber);
     JOptionPane.showConfirmDialog(null,"Your Age is:-" + age);
    }
}

