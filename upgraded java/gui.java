import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter Your Name:)");
        int age =Integer.parseInt( JOptionPane.showInputDialog("Enter Your age:)"));
        double height =Double.parseDouble( JOptionPane.showInputDialog("Enter Your Height:)"));
        JOptionPane.showMessageDialog(null, "Your Name is:= " + name );
        JOptionPane.showMessageDialog(null, "Your Age  is:= " + age );
        JOptionPane.showInternalConfirmDialog(null, "Your Height  is:= " + height );
     

    }
}