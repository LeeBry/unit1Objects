import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2= new Turtle(turtleWorld);
        Turtle turtle3= new Turtle(turtleWorld);
        Turtle turtle4= new Turtle(turtleWorld);
        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle2.setPenColor(Color.BLUE);
        turtle2.penDown();
        turtle2.forward(50);
        turtle2.turn(180);
        turtle2.forward(50);
        turtle3.setPenColor(Color.RED);
        turtle3.penDown();
        turtle3.forward(100);
        turtle3.turn(270);
        turtle3.forward(50);
        turtle4.setPenColor(Color.BLACK);
        turtle4.penDown();
        turtle4.forward(100);
        turtle4.turn(360);
        turtle4.forward(50);
       
    }
}
