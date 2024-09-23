package Patterns;
/**
 
2.create the given pattern 
0
00
000
0000


 */
public class Pattern2 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
