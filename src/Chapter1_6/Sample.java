package Chapter1_6;

public class Sample {
	private String message;

	public Test test(String value) {
		class A implements Test {

			@Override
			public void execute() {
				System.out.println(message + value);
			}

		}

		//value = "LocalClass"; ⇒　valueは実質finalでなければならないため、test()メソッドで引数があり、値が変更されているため、コンパイルエラーになる。
		message = "Hello, ";
		return new A();
	}

}
