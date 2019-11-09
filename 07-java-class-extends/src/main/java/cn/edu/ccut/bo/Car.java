package cn.edu.ccut.bo;

public class Car extends Tool {
	
	private String type;
	private String color;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String id, String name, String type, String color) {
		super(id,name);
		this.color = color;
	}
	
	@Override
	public void sayHello() {
		System.out.println("hello car");
	}
	
	public static void main(String[] args) {
		Tool tool = new Car();
		tool.sayHello();
	}

}
