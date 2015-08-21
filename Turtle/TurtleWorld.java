import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        Random number = new Random();
        number.nextInt(100);
        
  
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle.setColor(Color.BLUE);
            while (true){
        turtle.moveTo(number.nextInt(),number.nextInt());
        turtle.setColor(Color.RED);
        turtle.moveTo(number.nextInt(),number.nextInt());
        turtle.setColor(Color.GREEN);
     
       
    }}
}
