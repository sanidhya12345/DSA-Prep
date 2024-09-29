package Leetcode;
import java.util.*;
import java.math.*;
public class Leetcode96{
    static BigInteger factorial(int n)
    {
        BigInteger f
            = new BigInteger("1");
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger fact1=factorial(2*n);
        BigInteger fact2=factorial(n+1);
        BigInteger fact3=factorial(n);
        BigInteger ans=fact1.divide(fact2.multiply(fact3));
        System.out.println(ans.intValue());
        sc.close();
    }
}