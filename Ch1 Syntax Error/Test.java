import javax.swing.JOptionPane;
import java.net.URL;
import javax.swing.ImageIcon;

public class Test
{
    public static void main (String[]args)throws Exception
    {
        URL imageLocation= new URL(
        "http://img2.wikia.nocookie.net/__cb20120127173628/finalfantasy/images/6/62/XIII-2_Mog_artwork.jpg");
        JOptionPane.showMessageDialog(null, "Hello Kupo!", "Title", 
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        String name= JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello "+name+ "!");
       
    }
}