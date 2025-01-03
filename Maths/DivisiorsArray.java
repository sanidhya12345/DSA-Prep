package Maths;

import java.io.*;
import java.util.*;
public class DivisiorsArray {

    static class StdIn
    {
        BufferedReader br;
        StringTokenizer st;

        public StdIn()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    private static final StdIn in=new StdIn();
    private static final PrintWriter out=new PrintWriter(System.out);

    static final long MAXN = 1000000;
    static long[] spf = new long[(int) (MAXN + 1)]; // Smallest prime factor array

    private static void computeSPF(){
        
        //initialize the spf for every number to itself.

        for(int i=2;i<=MAXN;i++){
            spf[i]=i;
        }

        //start the sieve process;

        for(int i=2;i*i<=MAXN;i++){
            if(spf[i]==i){ //check if i is prime or not.
                for (int j = i * i; j <= MAXN; j += i) {
                    if (spf[j] == j) { // Update spf[j] to the smallest prime factor
                        spf[j] = i;
                    }
                }
            }
        }
    }

    //Compute prime factorization using the spf array.

    public static Map<Long,Long> computeFactors(long num){
        Map<Long,Long> factors=new HashMap<>();

        while (num!=1) {
            long primefactor=spf[(int)num];
            factors.put(primefactor, factors.getOrDefault(primefactor, 0L)+1);
            num/=primefactor;
        }
        return factors;
    }
    public static void main(String[] args) {
        long n=in.nextLong();
        long m=in.nextLong();
        final long MOD=1000000007;
        //compute the spf array
        computeSPF();

        //precompute prime factor for all number up to m.

        Map<Long,Long> primepowerMap=new HashMap<>();

        for(long i=2;i<=m;i++){
            Map<Long,Long> factors=computeFactors(i);
            for(Map.Entry<Long,Long> entry:factors.entrySet()){
                long prime=entry.getKey();
                long power=entry.getValue();
                primepowerMap.put(prime,primepowerMap.getOrDefault(prime, 0L)+power);
            }
        }
        long [] arr=new long[(int)n+1];
        for(int i=1;i<=n;i++){
            arr[i]=in.nextLong();
        }

        for(int i=1;i<=n;i++){
            //create a copy of pre computer prime power map.
            Map<Long,Long> copy=new HashMap<>(primepowerMap);
            Map<Long,Long> factors=computeFactors(arr[i]);

            for(Map.Entry<Long,Long> entry:factors.entrySet()){
                long prime=entry.getKey();
                long power=entry.getValue();

                copy.put(prime,copy.getOrDefault(prime, 0L)+power);
            }

            long ans=1;

             for(Map.Entry<Long,Long> entry:copy.entrySet()){
                long power=entry.getValue();
                ans=(ans*(power+1)% MOD) % MOD;
             }
             out.print(ans+" ");
        }
        out.flush();
        out.close();
        
    }
}
