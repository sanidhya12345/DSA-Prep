package Package;

import java.util.Scanner;

public class PrimeNumber {

	
	static boolean checkPrime(int n) {
		boolean flag=false;
		if(n==0 || n==1) flag=true;
		
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		return !flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkPrime(n));
		sc.close();
	}

}
