package day14.interthreadcommunication;

public class producer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Producer extends Thread {
			Q obj;

			public Producer(Q obj) {

				this.obj = obj;
				start();
			}

			public void run() {
				int i = 0;
				while (true) {
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
						System.out.println(e);
					}
					obj.put(i);
					i++;
				}
			}
		}
	}

}
