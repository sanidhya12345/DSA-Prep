package Other;

import java.util.*;
public class NaughtyNumber {
    public static int findDistinctPF(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        if (n % 2 == 0) {
            primeFactors.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                primeFactors.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 2) {
            primeFactors.add(n);
        }
        return primeFactors.size();
    }
    public static int digitCount(int n){
        return Integer.toString(n).length();
    }
    public static boolean checkNaughty(int n){
        return findDistinctPF(n)==digitCount(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] naughty=new int[100001];
        naughty[0]=0;
        naughty[1]=1;
        for(int i=2;i<100001;i++){
            if(checkNaughty(i)){
                naughty[i]=naughty[i-1]+1;
            }
            else{
                naughty[i]=naughty[i-1];
            }
        }
        int q=sc.nextInt();
        while (q--!=0) {
            int a =sc.nextInt();
            int b=sc.nextInt();
            System.out.println(naughty[b]-naughty[a-1]);
        }
        sc.close();
    }
}
