package Package;

import java.util.*;
public class CamelCase {
	public static int camelcase(String s) {
	    // Write your code here
	      int i=0;
	      int n=s.length();
	      int stick=0;
	      while(i<n){
	          if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
	              stick++;
	          }
	          i++;
	      }
	      return stick+1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(camelcase(s));
		sc.close();
	}

}
