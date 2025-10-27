package day14.synchronization;

public class InsufficientBalanceException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class InsufficientBalanceException extends Exception {

			public InsufficientBalanceException() {
				super("Insufficient balance in your account");
			}

			public InsufficientBalanceException(String message) {
				super(message);
			}
		}
	}

}
