package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReachableNode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] graph=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        int s=sc.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        boolean [] visited=new boolean[n];
        Arrays.fill(visited,false);
        queue.offer(s-1);
        visited[s-1]=true;
        int[] lvl = new int[n+5];
        Arrays.fill(lvl, 0);
        lvl[s-1] = 0;
        while(!queue.isEmpty()){

            int start=queue.peek();

            for(int j=0;j<n;j++){

                if(graph[start][j]==1 && visited[j]==false){

                    queue.offer(j);
                    visited[j]=true;

                    lvl[j]=lvl[start]+1;
                }
            }
            queue.poll();
        }
        System.out.println(Arrays.toString(visited));
        sc.close();
    }
}
