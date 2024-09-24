package HackerrankBeginner;

public class TimeConversion {
    public static String timeConversion(String s) {
        String[] timeParts = s.split(":");
            String hours = timeParts[0];
            String minutes = timeParts[1];
            String secondsPeriod = timeParts[2];
            String period = secondsPeriod.substring(2);
            String seconds = secondsPeriod.substring(0, 2);
            
            int hour = Integer.parseInt(hours);
            if (period.equals("PM")) {
                if (hour != 12) {
                    hour += 12;
                }
            } else {
                if (hour == 12) {
                    hour = 0;
                }
            }
            
            String newHour = String.format("%02d", hour);
            
            return newHour + ":" + minutes + ":" + seconds;
    
        }    
}
