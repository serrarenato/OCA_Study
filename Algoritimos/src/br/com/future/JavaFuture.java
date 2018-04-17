package br.com.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class JavaFuture {
	private static final ExecutorService pool = Executors.newFixedThreadPool(10);

	public static Callable<String> getData(final int index, final int time) {
		return new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(time);
				return "TESTE-" + index;
			}
		};
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("Processors = " + Runtime.getRuntime().availableProcessors());
		long start = System.nanoTime();
		Callable<String> c1 = getData(0, 1000);
		Callable<String> c2 = getData(1, 10000);
		Future<String> f1 = pool.submit(c1);
		Future<String> f2 = pool.submit(c2);
		///////////////////////////////
		System.out.println(f1.get());
		System.out.println("Acabou o primeiro");
		System.out.println(f2.get());
		System.out.println("Acabou o segundo");
		//////////////////////////////////
		long end = System.nanoTime();
		System.out.println("Tempo decorrido (segundos) = " + ((end - start) / 1.0E9));
		pool.shutdown();
	}
}
