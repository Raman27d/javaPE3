import java.text.*;
import java.util.Calendar;

class WeekDays{
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatted = new SimpleDateFormat("E  dd / MM / yy");
        while(Calendar.MONDAY!=calendar.get(Calendar.DAY_OF_WEEK)){
            calendar.add(Calendar.DATE,-1);
        }
        System.out.println(formatted.format(calendar.getTime()));
        calendar.add(Calendar.DATE,6);
        System.out.println(formatted.format(calendar.getTime()));
    }
}