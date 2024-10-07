package Graphs;

import java.util.Scanner;

public class GraphIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] graph=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }
        }

        //for each node “i” how many nodes are directly connected to it 

        for(int i=0;i<n;i++){
            int directlyConnect=0;
            for(int j=0;j<n;j++){

                if(graph[i][j]==1){
                    directlyConnect++;
                }
            }
            System.out.println("Directly Connected Nodes from "+i+" -> "+directlyConnect);
        }
        sc.close();
    }
}
