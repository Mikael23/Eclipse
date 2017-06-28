import java.util.LinkedList;
import java.util.Queue;

import org.omg.Messaging.SyncScopeHelper;

public class Querue implements Runnable {

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
					Thread.sleep(3000);
					System.out.println("Size:" + queue.size());
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

				queue.add(r.random());

			});

			mythread.start();
			// Mythread.join();

			for (int q = 0; q < 5; q++) {
				Thread MynewThread = new Thread((Runnable) () -> {
					for (int e = 0; e <= 6; e++) {
						System.out.println("Element" + queue.peek());
					}
				});

				MynewThread.start();
				// MynewThread.join();
			}

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
