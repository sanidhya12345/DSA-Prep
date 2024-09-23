package Arrays;

import java.util.Scanner;

public class PrintTheBoundaryElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] matrix=new int[3][3];
        //input the matrix elements

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //print the boundary elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==0 || j==0 || i==2 || j==2){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
