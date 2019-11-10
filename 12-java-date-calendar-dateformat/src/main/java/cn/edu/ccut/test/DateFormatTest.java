package cn.edu.ccut.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * DateFormatTest
 * @author jwang
 *
 */
public class DateFormatTest {

	public static void main(String[] args) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		//public final String format(Date date):根据模板格式化时间类为字符串输出
		String dataStr = sdf.format(date);
		System.out.println(dataStr);
		//public Date parse(String source):根据模板将字符串转化为Date，容易抛出转换异常
		System.out.println(sdf.parse("2019-11-11 00:00:00"));
		
	}

}
