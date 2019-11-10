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
			private String name = "局部内部类";
			
			public String getName(){
				return this.name;
			}
		}
		System.out.println(new F().getName());
	}
	
}
