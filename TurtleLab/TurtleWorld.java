import java.awt.*;
import java.util.Random;

 public class TurtleWorld 
    {
        public static void main (String[] args)
        {World turtleWorld = new World(1000,1000);
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        Turtle turtle2= new Turtle(turtleWorld);

        turtle.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle.forward(-500);
        turtle.turn(90);
        turtle.forward(50);
        turtle2.setPenColor(Color.BLUE);
        turtle2.penDown();
        turtle2.forward(500);
        turtle2.turn(180);
        int continues= 1000;
        int distance= 1000;
        Random gener= new Random();
        int randJump= gener.nextInt(1000);
        
        while (continues >0)
        {
             turtle.turn(10);
             turtle.forward(distance);
             turtle2.turn(-10);
             turtle2.forward(distance);
             continues=continues -1;
             distance= distance-1;
          
  
            if (randJump >0)
             {turtle.turn(randJump+100);
              turtle.forward(distance+100);
              if (continues >randJump)
              {turtle.setPenColor(Color.PINK);
               turtle2.setPenColor(Color.RED);
              System.out.println(continues+"Pink and Red lines");
                }
                if (continues <randJump)
              {turtle.setPenColor(Color.BLACK);
               turtle2.setPenColor(Color.ORANGE);
               System.out.println(continues+ "Black and Orange Lines");
                }
              turtle2.turn(randJump+100);
              turtle2.forward(distance+100);
              
            }
             
}
}
}