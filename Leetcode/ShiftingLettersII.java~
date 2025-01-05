import java.util.*;
public class ShiftingLettersII{
    public static void main(String [] args){
        String s="abc";
        int [][] shifts={{0,1,0},{1,2,1},{0,2,1}};
        List<Pair> list=new ArrayList<>();
        for(int i=97;i<=122;i++){
            if(i==97){
                Pair p=new Pair((char)(i+1),(char)122);
                list.add(p);
            }
            else if(i==122){
                Pair p=new Pair((char)97,(char)(i+1));
                list.add(p);
            }
            else{
                Pair p=new Pair((char)(i+1),(char)(i-1));
                list.add(p);
            }
        }
        int n=shifts.length;
        String ans="";
        char [] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            int start=shifts[i][0];
            int end=shifts[i][1];
            int dir=shifts[i][2];
            for(int j=start;j<=end;j++){
               arr[j]=dir==0?list.get(arr[j]-'a').b:list.get(arr[j]-'a').f;
            }
        }
        ans=new String(arr);
        System.out.println(ans);
    }
}
class Pair{
    char f;
    char b;
    public Pair(char f,char b){
        this.f=f;
        this.b=b;
    }
}
