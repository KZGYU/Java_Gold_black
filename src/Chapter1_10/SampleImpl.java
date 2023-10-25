package Chapter1_10;

public class SampleImpl implements Sample {
	
	/*
	 * interfaceのSampleクラスではメソッドにstaticが修飾されている。
	 * この場合、実装側ではオーバーライドはできない。
	 */
	
	public static void test() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		/*
		 * コンソールにAが表示されるが、Bを表示したい場合、SampleImpl.test()に変更する。
		 */
		Sample.test();
	}

}
