package cn.edu.ccut.test;

import java.io.File;
import java.io.IOException;

/**
 * FileTest
 * @author jwang
 *
 */
public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		//public boolean createNewFile():����һ�����ļ�
		//System.out.println(file.createNewFile());
		//public boolean delete():ɾ���ļ����ļ���
		//System.out.println(file.delete());
		//public boolean exists():�ж��ļ����ļ����Ƿ����
		//public boolean mkdir():�����ļ���
		//System.out.println(file.mkdir());
		//public boolean mkdirs():�����ļ��У�������Ҫ�ĸ��ļ���
		//System.out.println(file.mkdirs());
		System.out.println(file.exists());
		//��ȡ��ǰ�ļ������·��
		System.out.println(file.getPath());
		//��ȡ��ǰ�ļ��ľ���·��+���·������������
		System.out.println(file.getAbsolutePath());
		//��ȡ��ǰ�ļ��ľ���·��������·��
		System.out.println(file.getCanonicalPath());
		//public String getName():����ļ����ļ��е�����
		System.out.println(file.getName());
		//public String getParent():��ȡ��·��
		System.out.println(file.getParent());
		//public boolean isAbsolute():�ж��Ƿ�Ϊ����·��
		System.out.println(file.isAbsolute());
		//public boolean isDirectory():�ж��Ƿ�Ϊ�ļ���
		System.out.println(file.isDirectory());
		//public boolean isFile():�ж��Ƿ�Ϊ�ļ�
		System.out.println(file.isFile());
	}

}
