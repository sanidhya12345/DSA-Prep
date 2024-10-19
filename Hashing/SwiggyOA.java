package Hashing;

import java.util.*;
public class SwiggyOA {

    //method to swap the character of t string.
    public static void swap(char [] tarr,int i,int j){
        char temp=tarr[i];
        tarr[i]=tarr[j];
        tarr[j]=temp;
    }
    //method to remove the same characters present at same index in both strings.
    public static void removeSameChar(char [] tarr,char [] sarr,int n){
        for(int i=0;i<n;i++){
            if(tarr[i]==sarr[i]){
                tarr[i]=' ';
                sarr[i]=' ';
            }
        }
    }
    //method to find the '1' in the left side of t if t[i]=='0' && s[i]=='1' 
    public static int findOne(char [] tarr,int start){
        int index=-1;
        for(int i=start-1;i>=0;i--){
            if(tarr[i]=='1'){
                index=i;
                break;
            }
        }
        return index;
    }
    //method to find the '0' in the right side of t if t[i]=='1' && s[i]=='0' 
    public static int findZero(char[] tarr,int start,int n){
        int index=-1;
        for(int i=start+1;i<n;i++){
            if(tarr[i]=='0'){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        String s=sc.next();
        int n=s.length();
        char [] tarr=t.toCharArray();// cpnvert t into array
        char [] sarr=s.toCharArray();//convert s into array.
        boolean flag=false;
        removeSameChar(tarr, sarr, n);//remove the same characters initially
        if((tarr[0]=='0' && sarr[0]=='1') || (tarr[n-1]=='1' && sarr[n-1]=='0')){
            System.out.println("Not Possible");
        }
        else{
            for(int i=0;i<n;i++){
                char c1=tarr[i];
                char c2=sarr[i];
                if(c1!=' ' && c2!=' '){
    
                    if(c1=='0' && c2=='1'){
                        int curr=i;
                        int pos=findOne(tarr, curr);
                        if(pos==-1){ //pos=-1 indicates that there is no 1 present in the left side of 0
                            flag=true;
                            break;
                        }
                        swap(tarr, curr, pos);
                        removeSameChar(tarr, sarr, n);
                    }
                    else if(c1=='1' && c2=='0'){
                        int curr=i;
                        int pos=findZero(tarr, curr, n);
                        if(pos==-1){ //pos=-1 indicates that there is no 0 present in the right side of 1.
                            flag=true;
                            break;
                        }
                        swap(tarr, curr, pos);
                        removeSameChar(tarr, sarr, n);
                    }
                }
            }
        }
        if(flag) System.out.println("Not Possible to convert"); //wherever flag is true which means it is impossible to convert t into s otherwise possible.
        System.out.println("Possible");
        sc.close();
    }
}