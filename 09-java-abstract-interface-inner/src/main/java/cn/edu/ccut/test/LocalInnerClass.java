package cn.edu.ccut.test;
/**
 * LocalInnerClass
 * @author jwang
 *
 */
public class LocalInnerClass {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		class F{
			private String name = "�ֲ��ڲ���";
			
			public String getName(){
				return this.name;
			}
		}
		System.out.println(new F().getName());
	}
	
}
