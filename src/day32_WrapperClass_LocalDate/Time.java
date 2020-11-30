package day32_WrapperClass_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime time= LocalTime.of(11,45,55);
        System.out.println("current time is : "+ time);

        LocalTime nowTime=LocalTime.now();
        System.out.println(nowTime);

        System.out.println("==========================");

        LocalDateTime time2=LocalDateTime.of(2020,11,23,11,52);
        System.out.println(time2);

        LocalDate t3=LocalDate.now();
        System.out.println(t3);

    }
}
