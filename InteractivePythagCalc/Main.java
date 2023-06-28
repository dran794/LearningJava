package InteractivePythagCalc;

import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String args[]) {

        String x = JOptionPane.showInputDialog("Do you wanna find the longest side? Give a 'yes' or 'no'");

        if (x.equals("yes")) {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Please give the a value:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Please give the b value:"));

            double c = Math.sqrt((a*a) + (b*b));

            JOptionPane.showMessageDialog(null, "The length of c is: " + c);
        }
        else if (x.equals("no")) {
            double c = Double.parseDouble(JOptionPane.showInputDialog("Please give the a value:"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Please give the b value:"));

            double a = Math.sqrt((c*c) - (b*b));

            JOptionPane.showMessageDialog(null, "The length of a is: " + a);
        }
    }
}
