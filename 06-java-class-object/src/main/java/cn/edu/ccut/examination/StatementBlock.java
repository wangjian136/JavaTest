package cn.edu.ccut.examination;

public class StatementBlock {

	public static void main(String[] args) {
		Car car = new Car();
		//Static Statement Block
		//Statement Block
		//Constructor Method
	}

}

class Car{
	//Static Statement Block
	static {
		System.out.println("Static Statement Block");
	}
	//Statement Block
	{
		System.out.println("Statement Block");
	}
	//Constructor Method
	public Car() {
		System.out.println("Constructor Method");
	}
}
