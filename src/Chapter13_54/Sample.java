package Chapter13_54;

import java.util.function.Consumer;

public class Sample {
public static void main(String[] args) {
	
    
	Consumer b = (var msg) -> System.out.println(msg); 
	b.accept("Java");
	
}

}
