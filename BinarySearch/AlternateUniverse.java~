import java.io.*;
import java.util.StringTokenizer;
public class AlternateUniverse{
    private static final PrintWriter out=new PrintWriter(System.out);
    private static final StdIn sc=new StdIn();

    public static boolean check(long mid,long [] a,long [] b,long n){
        long l=0;
        long r=mid;

        for(int i=1;i<=n;i++){
            long d=a[(int)i]; //contest i has the maximum rating of a[i]

            //check if the current r exceeds the rating d
            if(r>d){

                //if the lower bound also exceeds the d
                //
                if(l>d){
                    l--;
                    r--;
                }
                else{
                    // if only r exceed the d then update the r with the max(d+b[i],r)
                    // so that the range will increase.
                    r=Math.max(d+b[(int)i],r);
                    l--;
                    r--;
                }
            }
            else{
                //if r does not exceed the threshold then update with b[i] only,
                
                r=r+b[(int)i];
                l--;
                r--;
            }

            //if any time r becomes negative then return false.

            if(r<=-1){ return false;}
            else{ if(l<=-1) l=0;}
        }
        return true;
    }
    public static void main(String [] args){
        long test=sc.nextLong();
        while(test--!=0){

            long n=sc.nextLong();
            long [] a=new long[(int)n+1];
            long [] b=new long[(int)n+1];
            long r=n;
            for(int i=1;i<=n;i++){
                a[i]=sc.nextLong();
            }
            for(int i=1;i<=n;i++){
                b[i]=sc.nextLong();
            }

            long low=0;
            long high=n;
            while(low<=high){
                long mid=(low+high)/2;

                //check if mid rating value is sufficient

                if(check(mid,a,b,n)){
                    high=mid-1; //try for the smaller rating.
                    r=Math.min(r,mid);
                }
                else{
                    low=mid+1; //try for the larger rating.
                }
            }
            out.println(r);
            out.flush();
        }
        out.close();
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
