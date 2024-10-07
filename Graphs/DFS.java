package Graphs;

import java.util.*;
public class DFS {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] graph= {
            {0, 1, 0, 0, 1},
            {1, 0, 1, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 1, 1, 0, 1},
            {1, 0, 0, 1, 0}
        };
        int startVertex=sc.nextInt();
        boolean [] visited=new boolean[n];
        Arrays.fill(visited, false);

        Stack<Integer> stack=new Stack<>();

        stack.push(startVertex);
        visited[startVertex]=true;

        while (!stack.isEmpty()) {
            int curr=stack.pop();

            System.out.print( curr+" ");

            for(int i=0;i<n;i++){

                if(graph[curr][i]==1 && !visited[i]){
                    stack.push(i);
                    visited[i]=true;
                }
            }
        }
        sc.close();
    }
}