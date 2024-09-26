package Leetcode;

public class TwoEventConflict {
    public boolean haveConflict(String[] event1, String[] event2) {
       String start1=event1[0];
       String end1=event1[1];
       String start2=event2[0];
       String end2=event2[1];
       int starttime1=Integer.parseInt(start1.substring(0,2))*60+Integer.parseInt(start1.substring(3,5));
       int endtime1=Integer.parseInt(end1.substring(0,2))*60+Integer.parseInt(end1.substring(3,5));
       int starttime2=Integer.parseInt(start2.substring(0,2))*60+Integer.parseInt(start2.substring(3,5));
       int endtime2=Integer.parseInt(end2.substring(0,2))*60+Integer.parseInt(end2.substring(3,5));
       
       return endtime1>=starttime2 && starttime1<=endtime2;
   }
}
