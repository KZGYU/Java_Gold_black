package Chapter10_7;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sample {
	public static void main(String[] args) throws IOException, IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("sample.properties"));
		
		Set keys = prop.keySet();
		for (Object key : keys) {
			System.out.println(prop.get(key));
		}
		
		
		prop.forEach((k,v) -> System.out.println(v));;
		
	}

}
