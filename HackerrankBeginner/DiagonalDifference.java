package HackerrankBeginner;

import java.util.Scanner;

public class DiagonalDifference {
     public static void main(String args[]) {
      
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int [][] matrix=new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              matrix[i][j]=in.nextInt();
          }
      }
      int leftsum=0;
      int rightsum=0;
      
      //left diagonal sum calculate
      
      for(int i=0;i<n;i++){
          leftsum+=matrix[i][i];
      }
      
      //right diagonal sum calculate
      
      int i=0;
      int j=n-1;
      while(i<n && j>=0){
          rightsum+=matrix[i][j];
          i++;
          j--;
      }
      
      System.out.println(Math.abs(leftsum-rightsum));
      in.close();
    }
}
