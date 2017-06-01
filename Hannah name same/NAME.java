import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.math.*;

public class NAME
{
    private String vName;
    private String reverse;

    public NAME()
    {
        // initialise instance variables
        vName = "";
        reverse = "";
    }

    public void CheckName()
    {
        vName = JOptionPane.showInputDialog("Please enter your name");
        int length = vName.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )

        { reverse = reverse + vName.charAt(i);
          

        }
          if(reverse.equals (vName))
            {
                System.out.println("The name is a palindrome");
            }
           
          else {
              System.out.println("The name is not a palindrome");
            }
    }
}
