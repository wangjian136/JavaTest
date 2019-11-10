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
		//public final String format(Date date):����ģ���ʽ��ʱ����Ϊ�ַ������
		String dataStr = sdf.format(date);
		System.out.println(dataStr);
		//public Date parse(String source):����ģ�彫�ַ���ת��ΪDate�������׳�ת���쳣
		System.out.println(sdf.parse("2019-11-11 00:00:00"));
		
	}

}
