package ChapterXX_12;

public class Student {
	private String name, city;

	public Student(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return name + ":" + city;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
}