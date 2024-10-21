package TwoPointers;

public class SalesforceSDEInterview {

    public static boolean checkSubsequence(int [] a,int [] b){
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        int count=0;
        while (i<n && j<m) {
            if(a[i]==b[j]){
                i++;
                j++;
                count++;
            }
            else{
                i++;
            }
        }
        return count==m;
    }
    public static void main(String[] args) {
        int [] a={1,2,5,8,8,6,5,4,3};
        int [] b={5,5};
        System.out.println(checkSubsequence(a, b));
    }
}
