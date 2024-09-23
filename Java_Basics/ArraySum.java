package Java_Basics;

public class ArraySum {
    public static void main(String[] args) {
        int [] arr={1,2,32,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
