package cn.edu.ccut.test;

/**
 * AssignmentOperator
 * =��+=��-=��/=��*=��%=
 * @author jwang
 *
 */
public class AssignmentOperator {

	public static void main(String[] args) {
		int result = 1;//����
		System.out.println("result = "+result);//1
		result += 2;//�ӵ���
		//result = result + 2;
		System.out.println("result = "+result);//3
		result -= 2;//������
		//result = result - 2;
		System.out.println("result = "+result);//1
		result *= 2;//�˵���
		//result = result * 2;
		System.out.println("result = "+result);//2
		result /= 2;//������
		//result = result / 2;
		System.out.println("result = "+result);//1
		result %= 2;//ȡ�����
		//result = result % 2;
		System.out.println("result = "+result);//1
	}

}
