package Arrays;

public class SumOddEvenIndex {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int sumOfElementAtOddIndex=0;
        int sumOfElementAtEvenIndex=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sumOfElementAtEvenIndex+=arr[i];
            }
            else{
                sumOfElementAtOddIndex+=arr[i];
            }
        }
        System.out.println("Sum of element at odd index: "+sumOfElementAtOddIndex);
        System.out.println("Sum of element at even index: "+sumOfElementAtEvenIndex);
    }
}
