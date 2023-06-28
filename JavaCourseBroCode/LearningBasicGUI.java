package JavaCourseBroCode;

import javax.swing.JOptionPane;

public class LearningBasicGUI {
    
    public static void main(String[] args) {
        
        //To give it a name to read from
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);


        //Have to parse because we want to deal with numbers in a String format
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + "years old wow g");


        //Testing with doubles now
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        //I'm fucking around with code now
        if (height < 183) {
            JOptionPane.showMessageDialog(null, "You're a fucking short brutha");
        }
        else { JOptionPane.showMessageDialog(null, "Fuck you're so tall I'm looking at your cock g what the hell man I hope you have severe back issues my friend"); }
    }
}
