public class String1
{
    public static void main (String[] args)
    {
        String greeting= "Hello, world!";
        int n= greeting.length();
        System.out.println( greeting );
        System.out.println("length = "+ n );
        String river= "Mississippi";
        String bigRiver= river.toUpperCase();
        System.out.println("river: " + river + " bigRiver: " + bigRiver);
    }
}