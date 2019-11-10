package cn.edu.ccut.test;

import java.util.Calendar;
import java.util.Date;

/**
 * CalendarTest
 * @author jwang
 *
 */
public class CalendarTest {

	public static void main(String[] args) {
		//public static Calendar getInstance():用于生成Calendar对象
		Calendar cal = Calendar.getInstance();
		//public final Date getTime():获得Date类对象
		Date date = cal.getTime();
		System.out.println(date);
		//public long getTimeInMillis():获得相对于Unix元年（1970.1.1 00:00:00）的时间戳
		System.out.println(cal.getTimeInMillis());
		//public abstract void add(int field,int amount):在当前基础上增加或减少时间
		cal.add(Calendar.YEAR, 1);//增加一年
		System.out.println(cal.getTime());//Tue Nov 10 21:19:15 GMT+08:00 2020
		cal.add(Calendar.MONTH, -1);//减少一个月
		System.out.println(cal.getTime());//Sat Oct 10 21:20:07 GMT+08:00 2020
		//public int get(int field):获得某个属性，如年、月、日等
		System.out.println(cal.get(Calendar.DATE));//10
		//public int getActualMaximum(int field):给出某个属性的最大值，如年、月、日等等
		System.out.println(cal.getActualMaximum(Calendar.DATE));//month:0~11
		System.out.println(cal.getFirstDayOfWeek());
		//public final void set(int year, int month, int date, int hourOfDay, int minute, int second):设置指定时间
		cal.set(1970, 0, 1, 8, 0, 0);
		System.out.println(cal.getTimeInMillis());//!=0  ???
		
	}

}
