import java.awt.Rectangle;
import java.awt.Color;
import java.util.Random;

   
public class RectanglePrinter
{
    public static void main (String[]args)
    {
        Random number= new Random(1-100);
        Rectangle r1 = new Rectangle(0,0,number.nextInt(),50);
        System.out.println(r1);
    }
}