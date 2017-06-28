import java.util.LinkedList;
import java.util.Queue;

import org.omg.Messaging.SyncScopeHelper;

public class Querue {

	public static Queue<Integer> queue = new LinkedList<>();

	public int random() {

		int random = (int) (Math.random() * 50 + 1);

		return random;

	}

	public static void main(String[] args) throws InterruptedException {
		Querue r = new Querue();

		Thread threadd = new Thread((Runnable) () -> {
			System.out.println("Size:" + queue.size());

			try {
				while (true) {
					System.out.println("Size:" + queue.size());
					Thread.sleep(2000);

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});
		threadd.start();
		// threadd.join();

		for (int i = 0; i < 5; i++) {
			Thread mythread = new Thread((Runnable) () -> {
				while (true) {
					try {
						queue.add(r.random());
						Thread.sleep(2000);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			});

			mythread.start();

		}
		for (int q = 0; q < 5; q++) {
			Thread mynewThread = new Thread((Runnable) () -> {
				while (true) {
					try {
						System.out.println("Element" + queue.peek());
						Thread.sleep(2000);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			});

			mynewThread.start();
			
		}

	}

}
