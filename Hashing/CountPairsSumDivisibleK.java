package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairsSumDivisibleK {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long k=sc.nextLong();
    HashMap<Long,Long> map=new HashMap<>();
    long count=0;
    for(long i=1;i<=n;i++){
        long b=sc.nextLong();
        long g=k-(b%k);
        g=(g%k);
        count+=map.getOrDefault(g,0L);
        map.put(b%k,map.getOrDefault(b%k,0L)+1);
    }
    System.out.println(count);
    sc.close();
  }
}
