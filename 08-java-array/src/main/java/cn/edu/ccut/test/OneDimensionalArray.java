package cn.edu.ccut.test;

import java.util.Date;

/**
 * OneDimensionalArray
 * *数据类型 [] 数组名  /   数据类型  数组名 []
 * @author jwang
 *
 */
public class OneDimensionalArray {

	public static void main(String[] args) {
		int [] arrys00;
		int [] arrys01 = new int [] {1,2,3};//静态初始化
		int [] arrys02 = {1,2,3};//简化的静态初始化
		int [] arrys03 = new int[3];//动态初始化
		arrys03[0] = 1;
		arrys03[1] = 2;
		arrys03[2] = 3;
		for (int i : arrys01) {
			System.out.println(i);
		}
		Object [] arr1 = {"12",2,new Date()};
	}

}
