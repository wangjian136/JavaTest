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
		//public boolean createNewFile():创建一个新文件
		//System.out.println(file.createNewFile());
		//public boolean delete():删除文件或文件夹
		//System.out.println(file.delete());
		//public boolean exists():判断文件或文件夹是否存在
		//public boolean mkdir():创建文件夹
		//System.out.println(file.mkdir());
		//public boolean mkdirs():创建文件夹，包含必要的父文件夹
		//System.out.println(file.mkdirs());
		System.out.println(file.exists());
		//获取当前文件的相对路径
		System.out.println(file.getPath());
		//获取当前文件的绝对路径+相对路径，不做解析
		System.out.println(file.getAbsolutePath());
		//获取当前文件的绝对路径，解析路径
		System.out.println(file.getCanonicalPath());
		//public String getName():获得文件或文件夹的名称
		System.out.println(file.getName());
		//public String getParent():获取父路径
		System.out.println(file.getParent());
		//public boolean isAbsolute():判断是否为绝对路径
		System.out.println(file.isAbsolute());
		//public boolean isDirectory():判断是否为文件夹
		System.out.println(file.isDirectory());
		//public boolean isFile():判断是否为文件
		System.out.println(file.isFile());
	}

}
