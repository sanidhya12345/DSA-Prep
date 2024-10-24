package TwoPointers;

// Author: Sanidhya Varshney
// Date: 2024-10-24

/*

Given two arrays “a” and “b” ; find the unique pairs such that element in a is bigger than element in b 
Unique pair meaning :- (i,j) once selected this particular set of index cannot be used again. Index should not be repeated.

 */
import java.util.*;;
public class ExpediaOA {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={1,2,1};
        int n=a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        int count=0;
        while (i<n && j<n) {
            if(a[i]>b[j]){
                count++;
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}
