package HackerrankBeginner;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        if(year==1918){
            return "26.09.1918";
        }    
        int days=243;
        int dayOfProgrammer;
        if(year%400 ==0 || (year%4==0 && year%100 !=0) || (year%4==0 && year<1919)){
            days=244;
        }
        dayOfProgrammer = 256-days;
        
        return dayOfProgrammer+"."+"09."+year;
        }   
}
