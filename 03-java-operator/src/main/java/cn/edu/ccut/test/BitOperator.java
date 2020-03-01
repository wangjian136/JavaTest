package cn.edu.ccut.test;

/**
 * BitOperator
 * ~、|、&、^、<<、>>、<<<、>>>
 * @author jwang
 *
 */
public class BitOperator {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		//如果位为0，结果是1，如果位为1，结果是0,0010 -> 1101
		System.out.println("~ ="+(~a));
		//两个位只要有一个为1，那么结果就是1，否则就为0,0010|0001 -> 0011
		System.out.println("| ="+(a|b));
		//两个操作数中位都为1，结果才为1，否则结果为0,0010&0001 -> 0000
		System.out.println("& ="+(a&b));
		//两个操作数的位中，相同则结果为0，不同则结果为1,0010^0001 -> 0011
		System.out.println("^ ="+(a^b));
		//带符号左移
		System.out.println(a << 1);//0010 -> 0100
		//带符号右移，无符号右移
		System.out.println(-1 >> 1);//11111111 11111111 11111111 11111111 -> 11111111 11111111 11111111 11111111
		System.out.println(-1 >>> 1);//11111111 11111111 11111111 11111111 -> 01111111 11111111 11111111 11111111
	}

}
