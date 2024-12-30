package Maths;
import java.util.*;

class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row=row;;
        this.col=col;
    }
}
public class StateOfMatrix {
    static HashMap<Integer,Integer> rowMap=new HashMap<>();
    static HashMap<Integer,Integer> colMap=new HashMap<>();
    static HashMap<Pair,Integer> pairMap=new HashMap<>();
    public static int solve(int [][] mat,int n,int m){
        int countChanged=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                Pair pair=new Pair(i, j);
                int g=rowMap.getOrDefault(i, 0)-pairMap.getOrDefault(pair, 0);
                int p=colMap.getOrDefault(j, 0)-pairMap.getOrDefault(pair, 0);
                int t=g+p+pairMap.getOrDefault(pair, 0);
                if(t%2!=0){
                    countChanged++;
                }
            }
        }
        return n*m-countChanged;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] mat=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int q=sc.nextInt();
        while(q--!=0){
            int r=sc.nextInt();
            int c=sc.nextInt();
            Pair p=new Pair(r, c);
            pairMap.put(p,pairMap.getOrDefault(p, 0)+1);
            rowMap.put(r,rowMap.getOrDefault(r, 0)+1);
            colMap.put(c,colMap.getOrDefault(c, 0)+1);
        }
        System.out.println(solve(mat, n, m));
        sc.close();
    }
}
