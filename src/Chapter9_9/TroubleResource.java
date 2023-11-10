package Chapter9_9;

public class TroubleResource  implements AutoCloseable{
	@Override
	public void close() throws Exception{
		throw new RuntimeException("trouble");
	}
	

}
