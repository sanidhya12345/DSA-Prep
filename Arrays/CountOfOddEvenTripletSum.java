package Arrays;

public class CountOfOddEvenTripletSum {
     public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int tripletSum=0;
        int countOddTripletSum=0;
        int countEvenTripletSum=0;
    
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    tripletSum+=arr[i]+arr[j]+arr[k];
                    if(tripletSum%2==0){
                        countEvenTripletSum++;
                    }
                    else{
                        countOddTripletSum++;
                    }
                }
            }
        }
        System.out.println(countOddTripletSum+" "+countEvenTripletSum);
     }
}
