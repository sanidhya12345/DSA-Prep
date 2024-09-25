package HackerrankBeginner;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
           int front = p / 2;
        int back = (n - p) / 2;
            //This handles an edge case where we want 
            //the formula above to actually be 1 (not 0)
            //when n is even and p is one less than n
        if (n - p == 1 && n % 2 == 0) back++;
        if (front < back) {
            return front;
        }   else {
            return back;
        }
        }
    
}
