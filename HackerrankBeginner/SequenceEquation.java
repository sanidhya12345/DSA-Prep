package HackerrankBeginner;

public class SequenceEquation {
    static int findIndexSequence(int [] arr,int value){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                ans=i+1;
                break;
            }
        }
        int finalans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans){
                finalans=i+1;
            }
        }
        return finalans;
    }
}
