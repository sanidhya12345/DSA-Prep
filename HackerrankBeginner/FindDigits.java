package HackerrankBeginner;

public class FindDigits {
    public static int findDigits(int n) {
        // Write your code here
          int count=0;
          int copy=n;
           while(n!=0){
               int num=n%10;
               if(num!=0){
                    if(copy%num==0){
                        count++;
                    }   
               }
               n=n/10;
           }
           return count;
    
        }    
}
