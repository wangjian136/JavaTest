package cn.edu.ccut.bo;

public class Tool extends Object{

	private String id;
	private String name;
	
	public Tool() {}

	public Tool(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void sayHello() {
		System.out.println("hello tool");
	}
	
}
