import java.util.*;
public class ConstructKPalindrome{
  public static boolean canConstruct(String s,int k){
    int oddFreq=0;
    if(s.length()<k) return false;
    else if(s.length()==k) return true;
    else{
      HashMap<Character,Integer> map=new HashMap<>();
      for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
      for(int val:map.values()){
        if(val%2!=0) oddFreq++;
      }
    }
    return oddFreq<=k;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int k=sc.nextInt();
    System.out.println(canConstruct(s,k));
  }
}
