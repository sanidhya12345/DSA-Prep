package Other;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase().replace(" ", "");
		Set<Character> set=new HashSet<Character>();
		for(char ch:s.toCharArray()) set.add(ch);
		String news="";
		for(char ch:set) news+=ch;
		String ori="abcdefghijklmnopqrstuvwxyz";
		if(ori.equals(news)) {
			System.out.println("pangram");
		}
		else {
			System.out.println("not pangram");
		}
		sc.close();
	}
}
