import java.util.Scanner;
 
public class EuclidGcd    
{
    public long gcd(long p, long q)
    {
        if (p % q == 0)
            return q;
        return gcd(q, p % q);
    }
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Euclid GCD Algorithm Test\n");
        EuclidGcd eg = new EuclidGcd();
 
        System.out.println("Enter two integer numbers\n");
        long n1 = scan.nextLong();
        long n2 = scan.nextLong();
        long gcd = eg.gcd(n1, n2);
        System.out.println("\nGCD of "+ n1 +" and "+ n2 +" = "+ gcd);
    }
}