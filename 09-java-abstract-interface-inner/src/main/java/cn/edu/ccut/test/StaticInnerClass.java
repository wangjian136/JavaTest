package cn.edu.ccut.test;
/**
 * StaticInnerClass
 * @author jwang
 *
 */
public class StaticInnerClass {
	
	public static void main(String[] args) {
		//�����ڲ������
		C.D d = new C.D();
		d.show();
	}
	
}

//�ⲿ��C
class C {
	private String name = "Լ��";
	//�ڲ���D
	static class D{
		private static int age = 10;
		
		public void show(){
			System.out.println(D.age);
		}
	}
	
	public void play(){
		//���ʾ�̬�ڲ���ľ�̬����
		System.out.println(D.age);
	}
}