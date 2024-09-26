package HackerrankBeginner;
import java.util.*;
public class Challenge1 {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
            int ans=-1;
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==V){
                    ans=i;
                    break;
                }
            }
            return ans;
        }
}
