import java.awt.BorderLayout;
import java.util.*;
import javax.swing.*;

public class TestDraw
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        JFrame application = new JFrame();
        int input = -1; //default

        try {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of shapes:"));
        }
        catch (NullPointerException e1){
            System.exit(1); //EXIT the program
        }
        catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(null,"Invalid number: "+input);
            System.exit(1);
        }
        DrawPanel panel = new DrawPanel(input);

        JLabel statusLabel = new JLabel(panel.getLabelText()); // create a JLabel containing the shape information

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); // add drawing to CENTER by default
        application.add(statusLabel, BorderLayout.SOUTH); // add the status label to the SOUTH (bottom) of the frame
        application.setSize(500, 500);
        application.setVisible(true);
    }
}

