package day14.synchronization;

public class DepositLimitExceedsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class DepositLimitExceedsException extends Exception {

			public DepositLimitExceedsException()
			{
				super("Daily limit of Deposit is exceeded..");
			}
			public DepositLimitExceedsException(String message)
			{
				super(message);
			}
		}
	}

}
