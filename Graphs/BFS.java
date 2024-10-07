package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;

public class BFS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] graph=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }
        }

        Queue<Integer> queue=new LinkedList<>();
        boolean [] visited=new boolean[n];
        Arrays.fill(visited,false);
        queue.offer(0);
        visited[0]=true;
        while(!queue.isEmpty()){

            int start=queue.peek();

            for(int j=0;j<n;j++){

                if(graph[start][j]==1 && visited[j]==false){

                    queue.offer(j);
                    visited[j]=true;
                }
            }
            System.out.print(queue.poll()+" ");
        }
        sc.close();
    }
}
