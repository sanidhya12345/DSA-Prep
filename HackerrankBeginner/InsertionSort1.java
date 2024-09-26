package HackerrankBeginner;
import java.util.*;


public class InsertionSort1 {
    public static void main(String args[]) {
      
      
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int []arr=new int[n];
      for(int i=0;i<n;i++){
          int value=in.nextInt();
          arr[i]=value;
      }
      
      int tmp=arr[arr.length-1];
      
      for(int i=arr.length-2;i>=0;i--){
          if(tmp>=arr[i]){
              arr[i+1]=tmp;
              for(int j=0;j<n;j++){
                  System.out.print(arr[j]+" ");
              }
              break;
          }
          arr[i+1]=arr[i];
           for(int j=0;j<n;j++){
                  System.out.print(arr[j]+" ");
            }
             System.out.println();
          
      }
      if(tmp<arr[0]){
          arr[0]=tmp;
          for(int i=0;i<n;i++){
                  System.out.print(arr[i]+" ");
            }
      }
      
      
      in.close();
      
    }
}
