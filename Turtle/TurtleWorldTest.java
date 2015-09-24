import java.awt.Color;
import java.util.Random;

public class TurtleWorldTest
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.PINK);
        Random gener = new Random();
        number= gener.nextInt(10)+3;
        int interior= (180*(number-2)/number);
        int times= number;
        while (times !=0)
        {
            turtle.forward(50);
            turtle.turn(180-interior);
            times-=1;

        }
    }
}
