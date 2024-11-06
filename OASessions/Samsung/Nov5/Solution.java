package OASessions.Samsung.Nov5;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-06
 * Time: 10:02
 */

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //input the number of nodes
        int n=sc.nextInt();
        
        //number of edges in the tree is n-1
        int m=n-1;
        
        //w represent the weight of each node
        int [] w=new int[n+1];
        for(int i=1;i<=n;i++){
            w[i]=sc.nextInt();
        }
        
        //creating the graph with n nodes and m edges
        ArrayList<ArrayList<Integer>> G=new ArrayList<>();

        for(int i=0;i<=n;i++){
            G.add(new ArrayList<>());
        }

        //reading edges of the graph

        for(int i=1;i<=m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
            //making and undirected graph
        }

        Queue<Integer> q=new LinkedList<>();
        q.add(0);// inserting the starting node in the queue

        int [] visited=new int[n+5];//visited array represent the node is visited or not
        //0-> not visited
        //1->visited
        visited[0]=1;// since first node is the starting node that's why we have to mark root node first.

        int [] lvl=new int[n+5];
        lvl[0]=0;//level of first node is always 0

        //creating the load array for the lazy propagation apppraoch.
        //means we will carry our load value in each level and do the operation
        
        int [] ld=new int[n+1];

        int c=0;
        //applying the BFS approach
        while(!q.isEmpty()){
            
            int v=q.poll(); //top most element of queue.

            int r1=w[v]+ld[v];
            ld[v] = ld[v] - w[v];        
            c = c + Math.abs(r1);

            for(int i=0;i<G.get(v).size();i++){

                int u=G.get(v).get(i);

                if(visited[u]==0){

                    q.add(u);
                    visited[u]=1;
                    lvl[u] = lvl[v] + 1 ; //lvl[u] will be 1 greater than lvl[1] as we move 1 step forward from u to v 
                    ld[u] = ld[u] + ld[v];
                }
            }
        }
        System.out.println(c);

        sc.close();
    }
}