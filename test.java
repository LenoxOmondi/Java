import javax.swing.JOptionPane;
public class test {

    public static void main (String[]args){
        String name = JOptionPane.showInputDialog("Hello' what's your name?");
        String message = String.format("Welcome "+name+"!");
        JOptionPane.showMessageDialog(null, message);
    }
}