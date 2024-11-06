package Graphs;

import java.util.*;
public class BFSAdj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<ArrayList<Integer>> G = new ArrayList<>(); // constructing graph using adjacency list

        // creating n number of vertices in graph
        for (int i = 0; i <= n; i++) {
            G.add(new ArrayList<Integer>());
        }

        // reading edges of graph
        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            G.get(u).add(v);
            G.get(v).add(u);
            // making un-directed graph
        }
        Queue<Integer> q = new LinkedList<>(); // declaring a queue

        q.add(1); // pushing the source node = 1 in the queue

        int[] used = new int[n + 5]; // declaring an empty used array where in used[i] = 0 means this node has not yet been visited in our algorithm
        used[1] = 1; // 1st node has been visited hence setting it as 1 and it is inserted in the queue as well

        int[] lvl = new int[n + 5]; // declaring level array which lets us know level of each node
        lvl[1] = 0; // lvl of 1st node, which is the source node, is 0 as we start from here

        while (!q.isEmpty()) {
            // BFS Algo

            int v = q.remove(); // top most element of queue

            System.out.println(v + " " + lvl[v]); // printing that node with its level

            for (int i = 0; i < G.get(v).size(); i++) {
                // iterating through all nodes connected to node v
                int u = G.get(v).get(i);
                if (used[u] == 0) {
                    // if the node u (node connected to v) has never been visited before then let's visit it
                    q.add(u);
                    used[u] = 1; // it has now been visited hence setting its value as 1
                    lvl[u] = lvl[v] + 1; // lvl[u] will be 1 greater than lvl[1] as we move 1 step forward from u to v
                }
            }
        }
        sc.close();
    }
}
