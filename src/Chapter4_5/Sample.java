package Chapter4_5;

import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		Optional<String> sample = Optional.empty();
		sample.ifPresent((str) -> System.out.println(str));
	}

}
