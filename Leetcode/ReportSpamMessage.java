package Leetcode;
import java.util.*;
public class ReportSpamMessage {
    public static void main(String[] args) {
        String [] message={"hello","world","leetcode"};
        String [] bannedWords={"world","hello"};
        HashSet<String> banned=new HashSet<>();
        for(String i:bannedWords){
            banned.add(i);
        }
        int count=0;
        for(String i:message){
            if(banned.contains(i)){
                count++;
            }
        }
        System.out.println(count);
    }

}
