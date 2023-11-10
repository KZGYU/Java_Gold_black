package ChapterXX_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("太郎", "東京"),
				new Student("次郎", "埼玉"),
				new Student("三郎", "東京"),
				new Student("花子", "神奈川"));
		list.stream().collect(
				Collectors.groupingBy(Student::getCity))
				.forEach((c, s) -> System.out.print(s + " "));
	}

}
