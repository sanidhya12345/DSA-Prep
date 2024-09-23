package Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,2,3,2};
        int target=2;
        int firstIndex=-1;
        int lastIndex=-1;
        //finding the first index
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                firstIndex=i;
                break;
            }
        }
        //finding the last index
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]==target){
                lastIndex=j;
                break;
            }
        }
        System.out.println("First Index: "+firstIndex);
        System.out.println("Last Index: "+lastIndex);
    }
}
