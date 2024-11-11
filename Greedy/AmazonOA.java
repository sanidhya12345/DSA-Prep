package Greedy;

/**
 * GitHub: sanidhya12345
 * Date: 2024-11-11
 * Time: 11:17
 */

import java.io.*;
import java.util.*;
public class AmazonOA {
    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out);
    static int first(int [] arr, int n,int target){
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                ans=i;
                break;
            }
        }
        return ans;
    }

    static int last(int [] arr,int n,int target){
        int ans=-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==target){
                ans=i;
                break; 
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Your code here

        int n=in.nextInt();
        int [] weights=new int[n];
        int [] dist=new int[n];

        for(int i=0;i<n;i++) weights[i]=in.nextInt();
        for(int i=0;i<n;i++) dist[i]=in.nextInt();

        int [] numberLine=new int[100+n];
        Arrays.fill(numberLine, -1);
        for(int i=0;i<n;i++){
            numberLine[i]=weights[i];
        }
        
        Pair [] arr=new Pair[n];
        for (int i=0;i<n;i++){
            arr[i]=new Pair(weights[i],dist[i]);
        }

        Arrays.sort(arr,Comparator.comparingInt(pair->pair.weight));

        for(int i=0;i<n;i++){
            weights[i]=arr[i].weight;
            dist[i]=arr[i].dist;
        }
        int nextNum=weights[0];
        int finalmoves=0;
        int lastIndex=last(numberLine, numberLine.length, nextNum);
        for(int i=1;i<n;i++){
            int ele=weights[i];
            int firstIndex=first(numberLine, numberLine.length, ele);
            int ptr=firstIndex;
            int moves=0;
            if(firstIndex<lastIndex && numberLine[firstIndex]!=numberLine[lastIndex]){
                while(numberLine[ptr]!=-1){
                    ptr+=dist[i];
                    moves++;
                    if(numberLine[ptr]==-1 && ptr>lastIndex){
                        numberLine[ptr]=ele;
                        nextNum=ele;
                        numberLine[firstIndex]=-1;
                        lastIndex=last(numberLine, numberLine.length, nextNum);
                        finalmoves+=moves;
                        break;
                    }
                }
            }
        }
        out.println(finalmoves);
        out.flush();
    }
}

class Pair{
    int weight;
    int dist;
    Pair(int weight,int dist){
        this.weight=weight;
        this.dist=dist;
    }
}
