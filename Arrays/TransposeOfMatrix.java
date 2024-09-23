package Arrays;
import java.util.*;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] matrix=new int[3][3];
        //input the matrix elements

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int [][] arr2=new int[3][3];
        //tranpose of matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=matrix[j][i];
            }
        }

        //print the matrix
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
