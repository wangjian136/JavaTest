package cn.edu.ccut.examination;

public class ParameterPassing {

	public static void main(String[] args) {
		String str = "test";
		Music music = new Music("´óÌïºóÉú×Ð");
		music.change(str);
		System.out.println(str);
		music.change(music);
		System.out.println(music.getName());
	}

}

class Music{
	
	private String name;
	
	//Constructor Method
	public Music(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//1
	public void change(String str) {
		str = "are you ok?";
	}
	//2
	public void change(Music music) {
		music.setName("it's very good !");
	}
}
