package Chapter13_75;

import java.util.List;
import java.util.stream.IntStream;

public class Sample {
	public static void main(String[] args) {
		final List<String> list=List.of("A","B","C","D","E");
		final List<String> list2=List.of("D","E","F");
		
		IntStream
		.range(0,Math.min(list.size(), list2.size()))
		.mapToObj((i) -> list.get(i) +  " " + list2.get(i))
		.forEach(System.out::println);
		
	}

}
