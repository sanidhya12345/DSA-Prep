package Arrays;

public class SumEvenOdd {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int sumOdd=0;
        int sumEven=0;
        for(Integer i:arr){
            if(i%2==0){
                sumEven+=i;
            }
            else{
                sumOdd+=i;
            }
        }
        System.out.println("Sum of odd array elements: "+sumOdd);
        System.out.println("Sum of even array elements: "+sumEven);
    }
}
