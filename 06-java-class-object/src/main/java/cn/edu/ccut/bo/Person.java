package cn.edu.ccut.bo;
/**
 * Standard entity class
 * @author jwang
 *
 */
public class Person {
	//Attributes...
	private String id;
	private String name;
	private Integer age;
	private String sex;
	private String loc;
	//No-parameter construction method
	public Person() {}
	//Parametric construction method
	public Person(String id, String name, Integer age, String sex, String loc) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.loc = loc;
	}
	//getter¡¢setter method
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	//hashcode and equals
	
	//toString method
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", loc=" + loc + "]";
	}
}
