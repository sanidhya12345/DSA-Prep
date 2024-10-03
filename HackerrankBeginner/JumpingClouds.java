package HackerrankBeginner;

import java.util.List;

public class JumpingClouds {

    public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
    
          int jumps = 0;
    int index = 0;
    
    while (index < c.size() - 1) {
        if (index + 2 < c.size() && c.get(index + 2) == 0) {
            index += 2;
        } else {
            index += 1;
        }
        jumps++;
    }
    
    return jumps;
    }

}