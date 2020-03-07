package cn.edu.ccut.jdk8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * new Time
 * 新的、线程安全的、用于处理时间的类。
 * @author jwang
 *
 */
public class NewFeatures {

	public static void main(String[] args) {
		//获取对象的方法
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);
        System.out.println("=========================================");
        LocalDateTime localDateTime = LocalDateTime.of(2048, 11, 25, 12, 00, 30);
        System.out.println(localDateTime);
        LocalDate date = LocalDate.of(2020, 12, 12);
        System.out.println(date);
        LocalTime time = LocalTime.of(14, 20, 30);
        System.out.println(time);
        System.out.println("=========================================");
        //对象间互转
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = now.toLocalTime();
        System.out.println(localTime);
        //与获取相关的方法(get系类的方法)
        System.out.println("=========================================");
        int year = now.getYear();
        System.out.println(year);
        Month month = now.getMonth();
        System.out.println(month);
        int monthValue = now.getMonthValue();
        System.out.println(monthValue);
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);
        int hour = now.getHour();
        System.out.println(hour);
        int minute = now.getMinute();
        System.out.println(minute);
        int second = now.getSecond();
        System.out.println(second);
        System.out.println("=========================================");
        //判断的方法
        boolean before = date.isBefore(now1);
        System.out.println(before);
        boolean after = date.isAfter(now1);
        System.out.println(after);
        boolean after1 = date.equals(now1);
        System.out.println(after1);
        boolean leapYear = date.isLeapYear();
        System.out.println(leapYear);
        System.out.println("=========================================");
        //格式化和解析字符串
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String dateStr = now.format(ofPattern);
        System.out.println(dateStr);
        String dateStr1="2020年02月02日";
        LocalDate parse = LocalDate.parse(dateStr1,ofPattern2);
        System.out.println(parse);
        System.out.println("=========================================");
        //增减时间
        LocalDateTime newDate= now.plusYears(1);
        int year1 = newDate.getYear();
        System.out.println(year1);
        LocalDateTime newDate2= now.minusDays(3);
        int day = newDate2.getDayOfMonth();
        System.out.println(day);
        System.out.println("=========================================");
        //指定年月日时分秒
        LocalDate now3 = LocalDate.now();
        LocalDate localDate3 = now3.withYear(2014);
        System.out.println(localDate3);
        System.out.println("=========================================");
        //Instant 时间戳类：
        //Instant 时间戳类从1970 -01 - 01 00:00:00 截止到当前时间的毫秒值
        Instant now12 = Instant.now();
        System.out.println(now12); //获取的是默认时区，获取的不是中国 的时区

	}
}
