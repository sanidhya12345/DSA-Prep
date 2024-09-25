package HackerrankBeginner;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         int maxPrice=-1;
        for(Integer i:keyboards){
            for(Integer j:drives){
                if(i+j<=b){
                    maxPrice=Math.max(maxPrice,i+j);
                }
            }
        }
        return maxPrice;
    }
}
