import java.awt.*;


 public class TurtleWorld
    {
        public static void main (String[] args)
        {World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        Turtle turtle2= new Turtle(turtleWorld);

        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(90);
        turtle.forward(50);
        turtle2.setPenColor(Color.BLUE);
        turtle2.penDown();
        turtle2.forward(50);
        turtle2.turn(180);
        int continues= 10;
        while (continues >0)
        {
             turtle.turn(90);
             turtle.forward(50);

        

       
    }
}
}