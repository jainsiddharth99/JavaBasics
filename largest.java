public class largest
{
    public static void main(String args[])
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=Integer.parseInt(args[2]);    
            if(a>b && a>c)
                {
                    System.out.println("A Is Largest Number!");
                }
            else if(b>a && b>c)
                {
                    System.out.println("B Is Largest number!");
                }
            else    
                {
                    System.out.println("C Is Largest number!");
                }
        }
}