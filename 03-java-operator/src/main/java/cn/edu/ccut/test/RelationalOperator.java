package cn.edu.ccut.test;

/**
 * RelationalOperator
 * ==��!=��<��<=��>��>=
 * @author jwang
 *
 */
public class RelationalOperator {

	public static void main(String[] args) {
		boolean result = 1 == 1;//���
		System.out.println("result = "+result);//true
		result = 1 != 1;//������
		System.out.println("result = "+result);//false
		result = 1 < 2;//С��
		System.out.println("result = "+result);//true
		result = 1 <= 0;//С�ڵ���
		System.out.println("result = "+result);//false
		result = 1 > 0;//����
		System.out.println("result = "+result);//true
		result = 1 >= 0;//���ڵ���
		System.out.println("result = "+result);//true
		
		System.out.println(4*(1+1));//���������
		System.out.println(new int [] {1,2});//�������������ʾ�������飬�����˵��
		
	}

}
