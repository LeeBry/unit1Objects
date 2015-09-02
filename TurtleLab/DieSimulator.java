import java.util.Random;

public class DieSimulator
{
    public static void main (String[] args)
    {
       //option A
        Random gener = new Random();
        int dieValue = gener.nextInt(6);  //returns numbers between 0 and 5, Inclusive
        dieValue+=1;
        System.out.println(dieValue);
        // Option B
        double dieValue2=Math.random(); //Returns a number bewteen 0 and 1 (can be floating, but not 1)
        dieValue2 *= 6; //Range is [0.6)
        dieValue2+=1; //range [1,7)
        System.out.println((int)dieValue2); // prints out 1,2,3,4,5,6
    }
}