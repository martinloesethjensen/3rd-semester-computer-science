package Thread;

public class RunThreads {
	public static void main(String[] args) {

		long max = 10_000_000L;
		final LongCounter counter = new LongCounter();
		int noOfThreads = 10;

		// Getting the time before threading
		long start = System.currentTimeMillis();

		// Thread array that stores Threads
		Thread[] threads = new Thread[noOfThreads];

		/*
		Multi threading to perform faster calculation of prime numbers.
		Create a new Thread that searches a scope of numbers and start the Thread.
		 */
		for (int i = 0; i < threads.length; i++) {
			final long startNumber = i * (max / noOfThreads);
			final long lastNumber = (i + 1) * (max / noOfThreads);

			threads[i] = new Thread(() -> {
				for (long number = startNumber; number <= lastNumber; number++) {
					if (isPrime(number)) {
						counter.increment();
					}
				}
			});

			threads[i].start();
		}

		// Join the threads
		try {
			for (Thread thread: threads) {
				thread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Getting time after threading
		long stop = System.currentTimeMillis();

		System.out.println(counter.get());
		System.out.println("Execution time: " + (stop - start) + " ms");

	}

	/*
	Method checks if a number is a prime number.
	returns true if it is a prime number.
	 */
	public static boolean isPrime(long number) {
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0 || number == 1) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
