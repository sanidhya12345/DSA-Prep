package Maths;

import java.io.*;
import java.util.StringTokenizer;
public class Smith {
    static final StdIn in = new StdIn();
    static final PrintWriter out=new PrintWriter(System.out);
    static int sumOfPrimeFactors(int num) {
        int sum = 0;
        while (num % 2 == 0) {
            sum += 2;
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                sum += digitSum(i);
                num /= i;
            }
        }
        if (num > 2) {
            sum += digitSum(num);
        }
        return sum;
    }
    static int digitSum(int n){
        int sum=0;
        while(n!=0){
            int m=n%10;
            sum+=m;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=in.nextInt();
        int ans=sumOfPrimeFactors(n)==digitSum(n)?1:0;
        out.println(ans);
        out.flush();
    }
}



class StdIn
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