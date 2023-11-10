package ChapterXX_22;

public class Account {
	private final int balance;
	private static final Account c = new Account();
	private static final int deposit = (int) (Math.random() * 100);
	

	public Account() {
	      balance = deposit - 10;
	    }

	public static void main(String... args) {
		System.out.println("Account Balance is: " + c.balance);
	}

}
