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
		//public static Calendar getInstance():��������Calendar����
		Calendar cal = Calendar.getInstance();
		//public final Date getTime():���Date�����
		Date date = cal.getTime();
		System.out.println(date);
		//public long getTimeInMillis():��������UnixԪ�꣨1970.1.1 00:00:00����ʱ���
		System.out.println(cal.getTimeInMillis());
		//public abstract void add(int field,int amount):�ڵ�ǰ���������ӻ����ʱ��
		cal.add(Calendar.YEAR, 1);//����һ��
		System.out.println(cal.getTime());//Tue Nov 10 21:19:15 GMT+08:00 2020
		cal.add(Calendar.MONTH, -1);//����һ����
		System.out.println(cal.getTime());//Sat Oct 10 21:20:07 GMT+08:00 2020
		//public int get(int field):���ĳ�����ԣ����ꡢ�¡��յ�
		System.out.println(cal.get(Calendar.DATE));//10
		//public int getActualMaximum(int field):����ĳ�����Ե����ֵ�����ꡢ�¡��յȵ�
		System.out.println(cal.getActualMaximum(Calendar.DATE));//month:0~11
		System.out.println(cal.getFirstDayOfWeek());
		//public final void set(int year, int month, int date, int hourOfDay, int minute, int second):����ָ��ʱ��
		cal.set(1970, 0, 1, 8, 0, 0);
		System.out.println(cal.getTimeInMillis());//!=0  ???
		
	}

}
