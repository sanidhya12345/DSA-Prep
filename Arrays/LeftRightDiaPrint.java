package Arrays;
import java.util.*;

public class LeftRightDiaPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] matrix=new int[3][3];
        //input the matrix elements

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //left diagonal printing

        for(int i=0;i<3;i++){
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        //right diagonal printing

        int i=0;
        int j=2;
        while(i<3 && j>=0){
            System.out.print(matrix[i][j]+" ");
            i++;
            j--;
        }

        sc.close();
    }
}
