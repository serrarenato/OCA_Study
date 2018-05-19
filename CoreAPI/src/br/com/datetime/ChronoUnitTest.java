package br.com.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
	public static void main(String[] args) {
		
		for (final ChronoUnit unit : ChronoUnit.values()) {
			final Duration duration = unit.getDuration();
			System.out.println(unit + ": " + duration + " (" + duration.getSeconds() + " seconds)");
		}
		System.out.println("-----------------------------------------------");
		LocalTime lt = LocalTime.of(10, 22, 33);
		System.out.println(lt);
		System.out.println(lt.truncatedTo(ChronoUnit.MINUTES));
		System.out.println(lt.truncatedTo(ChronoUnit.HOURS));
		System.out.println(lt.truncatedTo(ChronoUnit.HALF_DAYS));
		lt =LocalTime.of(13, 55);
		System.out.println(lt.truncatedTo(ChronoUnit.HALF_DAYS));
	}
}
