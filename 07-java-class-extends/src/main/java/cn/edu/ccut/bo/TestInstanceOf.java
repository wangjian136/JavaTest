package cn.edu.ccut.bo;

/**
 * TestInstanceOf
 * *∂‘œÛ instanceOf ¿‡
 * @author jwang
 *
 */
public class TestInstanceOf {

	public static void main(String[] args) {
		Tool tool = new Car();
		System.out.println(tool instanceof Car);
		System.out.println(tool instanceof Tool);
	}

}
