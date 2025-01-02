package Hashing;
import java.io.*;
import java.util.StringTokenizer;

import java.util.*;


public class DiagonalSeparation {

	private static final StdIn in=new StdIn();
	private static final PrintWriter out=new PrintWriter(System.out);
    public static void main(String[] args) {
        
        int N = in.nextInt();
        int M = in.nextInt();
        
        Set<Integer> rows = new TreeSet<>();
        Set<Integer> cols = new TreeSet<>();
        Map<Integer, Integer> rowLeftmostWhite = new HashMap<>();
        Map<Integer, Integer> rowRightmostBlack = new HashMap<>();
        Map<Integer, Integer> colTopmostWhite = new HashMap<>();
        Map<Integer, Integer> colBottommostBlack = new HashMap<>();
        
        // Read the inputs
        for (int i = 0; i < M; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            char c = in.next().charAt(0);
            rows.add(x);
            cols.add(y);
            if (c == 'B') {
                rowRightmostBlack.put(x, Math.max(rowRightmostBlack.getOrDefault(x, 0), y));
                colBottommostBlack.put(y, Math.max(colBottommostBlack.getOrDefault(y, 0), x));
            } else {
                rowLeftmostWhite.put(x, Math.min(rowLeftmostWhite.getOrDefault(x, N + 1), y));
                colTopmostWhite.put(y, Math.min(colTopmostWhite.getOrDefault(y, N + 1), x));
            }
        }

        // Check the validity of the row conditions
        if (!checkConditions(N, rows, rowLeftmostWhite, rowRightmostBlack)) {
            out.println("No");
            return;
        }

        // Check the validity of the column conditions
        if (!checkConditions(N, cols, colTopmostWhite, colBottommostBlack)) {
            out.println("No");
            return;
        }
        
        out.println("Yes");
        out.flush();
    }

    private static boolean checkConditions(int N, Set<Integer> indices, Map<Integer, Integer> leftmostWhite, Map<Integer, Integer> rightmostBlack) {
        int left = 0, right = N;
        
        for (int index : indices) {
            int leftmost = leftmostWhite.getOrDefault(index, N + 1);
            int rightmost = rightmostBlack.getOrDefault(index, 0);
            right = Math.min(right, leftmost - 1);
            if (rightmost > leftmost - 1 || right < rightmost) {
                return false;
            }
            left = rightmost;
        }
        
        return true;
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