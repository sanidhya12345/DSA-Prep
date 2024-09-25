package HackerrankBeginner;

import java.util.List;

public class BillDivision {
     public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
       int annaAmt=0;

        for(int i=0;i<bill.size();i++){
            if(i!=k){
                annaAmt+=bill.get(i);
            }
        }
        annaAmt=annaAmt/2;
        if(annaAmt==b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-annaAmt);
        }

    }

}
