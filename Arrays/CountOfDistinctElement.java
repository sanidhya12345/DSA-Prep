package Arrays;
public class CountOfDistinctElement {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,45,5,6,67,78,89,100,100,34,45};
       int [] map=new int[101];
        int countUnique=0;
        for(int i=0;i<arr.length;i++){
           map[arr[i]]++;
        }
        for(Integer i:map){
            if(i==1){
                countUnique++;
            }
        }
        System.out.println(countUnique);
    }
}
