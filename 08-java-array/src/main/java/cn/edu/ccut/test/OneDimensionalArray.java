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
		int [] arrys01 = {1,2,3};
		for (int i : arrys01) {
			System.out.println(i);
		}
		Object [] arr1 = {"12",2,new Date()};
	}

}
