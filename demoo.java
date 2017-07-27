import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class demo implements Runnable {
	private final static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	private final static Lock readLock = readWriteLock.readLock();

	private final static Lock writeLock = readWriteLock.writeLock();
	static int[] book = new int[5];
	static Random random = new Random();

	public static void main(String[] args) throws Exception {
		demo rt = new demo();
		ExecutorService ex = Executors.newFixedThreadPool(3);

		Runnable task = new Runnable() {
			@Override
			public void run() {

				try {
					nextPage();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable task1 = new Runnable() {

			@Override
			public void run() {
				try {
					read();
				} catch (InterruptedException e) {
					e.printStackTrace();

				}

			}
		};

		ex.submit(task1);
		ex.submit(task1);
		ex.submit(task);
		ex.shutdown();
		ex.shutdown();
		ex.shutdown();
	}

	public static Runnable read() throws InterruptedException {
		readLock.lock();
		try {
			for (int i = 0; i <= book.length; i++) {
				System.out.println(book[i]);

				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} finally {
			readLock.unlock();
		}
		return null;

	}

	public static void nextPage() throws InterruptedException {
		writeLock.lock();
		try {
			System.out.println("nextPage start");
			for (int i = 0; i < book.length - 1; i++) {

				book[i] = random.nextInt(5);
			}
			Thread.sleep(5000);
			System.out.println("nextPage finish");

		} finally {
			writeLock.unlock();
		}

	}

	@Override
	public void run() {

		try {
			read();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
