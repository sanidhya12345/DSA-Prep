package Leetcode;
public class Leetcode1413 {
    public static void main(String[] args) {
        int [] nums={-3,2,-3,4,2};
        int minprefix=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
            minprefix=Math.min(minprefix, sum);
        }
        System.out.println(1-minprefix);
    }
}
