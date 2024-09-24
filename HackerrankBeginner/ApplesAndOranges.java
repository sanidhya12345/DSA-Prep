package HackerrankBeginner;

import java.util.Scanner;

public class ApplesAndOranges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] apples=new int[m];
        int [] oranges=new int[n];
        for(int i=0;i<m;i++){
            apples[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            oranges[j]=sc.nextInt();
        }

        for(int i=0;i<m;i++){
            apples[i]=apples[i]+a;
        }
        for(int j=0;j<n;j++){
            oranges[j]=oranges[j]+b;
        }

        int countApples=0;
        int countOranges=0;

        for(int i=0;i<m;i++){
            if(apples[i]>=s && apples[i]<=t){
                countApples++;
            }
        }
        for(int i=0;i<n;i++){
            if(oranges[i]>=s && oranges[i]<=t){
                countOranges++;
            }
        }
        System.out.println(countApples);
        System.out.println(countOranges);
        sc.close();
    }
}
