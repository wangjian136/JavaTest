package cn.edu.ccut.test;

import java.util.Date;

/**
 * OneDimensionalArray
 * *�������� [] ������  /   ��������  ������ []
 * @author jwang
 *
 */
public class OneDimensionalArray {

	public static void main(String[] args) {
		int [] arrys00;
		int [] arrys01 = new int [] {1,2,3};//��̬��ʼ��
		int [] arrys02 = {1,2,3};//�򻯵ľ�̬��ʼ��
		int [] arrys03 = new int[3];//��̬��ʼ��
		arrys03[0] = 1;
		arrys03[1] = 2;
		arrys03[2] = 3;
		for (int i : arrys01) {
			System.out.println(i);
		}
		Object [] arr1 = {"12",2,new Date()};
	}

}
