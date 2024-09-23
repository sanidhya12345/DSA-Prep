package Patterns;
/*

Q.create  the given pattern 
000000
000000
000000
000000

 */
public class Pattern1 {
    public static void main(String[] args) {
        for(int row=0;row<4;row++){
            for(int col=0;col<6;col++){
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
