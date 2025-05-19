package Student;

public class Student {
	private int studId;
	private String Name;
	private int Age;
	private String College;

	public Student(int studId, String name, int age, String college) {
		this.studId = studId;
		Name = name;
		Age = age;
		College = college;
	}

	public Student() {

	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", Name=" + Name + ", Age=" + Age + ", College=" + College + "]";
	}

}
