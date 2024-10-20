package HackerrankBeginner;
public class ChoclateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
            int wrappers=n/c;
            int ans=n/c;
            while(wrappers>=m){
                int ch=(wrappers/m);
                wrappers=ch+(wrappers%m);
                ans+=ch;
            }
            return ans;
        }
}
