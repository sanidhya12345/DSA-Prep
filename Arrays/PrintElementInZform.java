package Arrays;
public class PrintElementInZform {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},{5,5,7,8},{7,8,9,10},{8,9,10,11}};
   
        int row= arr.length;
        int col= arr[0].length;
        
        for(int i=0;i<row;i++){
            System.out.print(arr[0][i]+" ");
        }
        
        int i=1;
        int j=col-2;
        
        while(i<row && j>=0){
           System.out.print(arr[i][j]+" ");
            i++;
            j--;
        }
        
        for(int k=1;k<row;k++){
            System.out.print(arr[row-1][k]+" ");
        }
    }
}
