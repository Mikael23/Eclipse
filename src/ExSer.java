import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExSer implements Callable<Integer> {
	private static int size = 3;
	final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService execut = Executors.newFixedThreadPool(size);
		ExSer er = new ExSer();
		int r = 0;
		for (int i = 0; i <= size; i++) {
			Future<Integer> future = execut.submit(er);

			while (!future.isDone()) {
				// System.out.println(Thread.currentThread());

				System.out.println("Thread is waiting");

				try {
					r = future.get();

				} catch (Exception e) {

				}

				System.out.println(r);
			}
		}
		execut.shutdown();
	}

	@Override
	public Integer call() throws Exception {
		int d = 0;
		try {
			System.out.println("enter two digits");
			int c = scanner.nextInt();
			int r = scanner.nextInt();
			d = c + r;
		} catch (Exception e) {

		}

		return d;
	}

}
