package Arrays;
import java.util.*;
public class SumOfMatrixElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] matrix=new int[3][3];
        //input the matrix elements

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //calculate the sum of matrix
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=matrix[i][j];
            }
        }



        //print the matrix
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Sum of Matrix: "+sum);
        sc.close();

    }    
}
