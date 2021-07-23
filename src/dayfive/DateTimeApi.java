package dayfive;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.zip.DataFormatException;


public class DateTimeApi {
    public static void main(String[] args) {

        //Q1
        LocalDate date = LocalDate.of(1990,12,30);
        LocalDateTime localDateTime = date.atTime(12,59,59,20);
        System.out.println(localDateTime);

        System.out.println("--------------------");

        //Q2
        LocalDate date2 = LocalDate.of(2021,7,23);;
        System.out.printf("The previous Thursday is: %s%n", date2.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));

        System.out.println("--------------------");

        //Q3
        ZonedDateTime date3 = ZonedDateTime.now();
        System.out.println(date3.getZone() + " : " + date3.getOffset());

        System.out.println("--------------------");

        //Q4
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        Instant instant = ZonedDateTime.now().toInstant();
        System.out.println(instant);

        System.out.println("--------------------");

        DateTimeApi dateTimeApi = new DateTimeApi();
        //Q5
        dateTimeApi.lengthOfMonth(2021);

        System.out.println("--------------------");

        //Q6
        dateTimeApi.listMonday(7);

        System.out.println("--------------------");

        //Q7
        System.out.println(dateTimeApi.friday13th(5,15));
    }

    public void lengthOfMonth(int y){
        try{
            Year valid = Year.of(y);
        }catch (Exception e){
            e.printStackTrace();
        }

        for(Month month : Month.values()){
            YearMonth ym = YearMonth.of(y,month);
            System.out.println(month + " : " + ym.lengthOfMonth() );
        }
    }

    public void listMonday(int m){
        Month month = null;
        try{
            month = Month.of(m);
        }catch (Exception e){
            e.printStackTrace();
        }

        LocalDate date = Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }

    public boolean friday13th(int m, int d){
        LocalDate data = null;

        try{
            data = Year.now().atMonth(m).atDay(d);
        }catch (Exception e){
            e.printStackTrace();
        }

        int day1 = data.get(ChronoField.DAY_OF_MONTH);
        int day2 = data.get(ChronoField.DAY_OF_WEEK);
        System.out.println(day1 + " : " + day2);
        return day1 == 13 && day2 == 5;
    }

}
