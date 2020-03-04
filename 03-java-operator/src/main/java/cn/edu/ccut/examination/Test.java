package cn.edu.ccut.examination;

public class Test {

	public static void main(String args[]) {

		int x, y;

		x = 5 >> 2;//00000000 00000000 00000000 00000101 -> 00000000 00000000 00000000 00000001

		y = x >>> 2;//00000000 00000000 00000000 00000001 -> 00000000 00000000 00000000 00000000

		System.out.println(y);
	}
}