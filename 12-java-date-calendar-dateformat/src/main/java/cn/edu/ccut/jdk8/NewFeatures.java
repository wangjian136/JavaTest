package cn.edu.ccut.jdk8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * new Time
 * �µġ��̰߳�ȫ�ġ����ڴ���ʱ����ࡣ
 * @author jwang
 *
 */
public class NewFeatures {

	public static void main(String[] args) {
		//��ȡ����ķ���
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
        //����以ת
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = now.toLocalTime();
        System.out.println(localTime);
        //���ȡ��صķ���(getϵ��ķ���)
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
        //�жϵķ���
        boolean before = date.isBefore(now1);
        System.out.println(before);
        boolean after = date.isAfter(now1);
        System.out.println(after);
        boolean after1 = date.equals(now1);
        System.out.println(after1);
        boolean leapYear = date.isLeapYear();
        System.out.println(leapYear);
        System.out.println("=========================================");
        //��ʽ���ͽ����ַ���
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HHʱmm��ss��");
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("yyyy��MM��dd��");
        String dateStr = now.format(ofPattern);
        System.out.println(dateStr);
        String dateStr1="2020��02��02��";
        LocalDate parse = LocalDate.parse(dateStr1,ofPattern2);
        System.out.println(parse);
        System.out.println("=========================================");
        //����ʱ��
        LocalDateTime newDate= now.plusYears(1);
        int year1 = newDate.getYear();
        System.out.println(year1);
        LocalDateTime newDate2= now.minusDays(3);
        int day = newDate2.getDayOfMonth();
        System.out.println(day);
        System.out.println("=========================================");
        //ָ��������ʱ����
        LocalDate now3 = LocalDate.now();
        LocalDate localDate3 = now3.withYear(2014);
        System.out.println(localDate3);
        System.out.println("=========================================");
        //Instant ʱ����ࣺ
        //Instant ʱ������1970 -01 - 01 00:00:00 ��ֹ����ǰʱ��ĺ���ֵ
        Instant now12 = Instant.now();
        System.out.println(now12); //��ȡ����Ĭ��ʱ������ȡ�Ĳ����й� ��ʱ��

	}
}
