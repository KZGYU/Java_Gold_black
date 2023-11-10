package Chapter4_20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("B","A","C","D");
		   Optional<String> maxVal = 
		   list.stream().min((a,b) -> b.compareTo(a));
		   maxVal.ifPresent(System.out::println);
	}

}
