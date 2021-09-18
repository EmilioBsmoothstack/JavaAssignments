/**This class demonstrates the use of the date time lib given in java 8
 * 
 */
package com.ss.five.time;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;

/**
 * @author Emilio_Benavente
 *
 */
public class DateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
		
		storeBirthday();
		System.out.println();
		prevThurs();
		System.out.println();
		idVsOffset();
		System.out.println();
		instantAndZDT();
		System.out.println();
		lenByMonth(randomDate);
		System.out.println();
		listAllMonInMonth(randomDate);
		System.out.println();
		isOccurOnFriday13(randomDate);
	}
	
	private static void storeBirthday() {
		LocalDate birthDate = LocalDate.of(2016, Month.JANUARY, 1);
		LocalTime birthTime = LocalTime.of(2, 30, 12, 80);
		LocalDateTime birthDateTotal = LocalDateTime.of(birthDate, birthTime);
		
		System.out.println("Birthday -> " + birthDateTotal);
	}
	
	private static void prevThurs() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
		LocalDate thursBefore = randomDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		
		System.out.println("Prev Thursday -> " + thursBefore);
	}
	
	private static void idVsOffset() {
		ZoneId zID = ZoneId.of("America/New_York");
		LocalDateTime  dt = LocalDateTime.now(zID);
		ZoneOffset zOff = ZoneOffset.of("+0100");
		ZonedDateTime dt2 = ZonedDateTime.of(dt,zOff);

		
		System.out.println("Time in New York -> " + dt);
		System.out.println("New York With Offset -> " + dt2);
	}
	
	private static void instantAndZDT() {
		Instant inst = Instant.now();
		ZonedDateTime zdt = inst.atZone(ZoneId.of("America/New_York"));
		
		Instant inst2 = zdt.toInstant();
		
		System.out.println("Time in New York -> " + zdt);
		System.out.println("Instant from NYC -> " + inst2);
	}
	
	private static void lenByMonth(LocalDate dt) {
		int year = dt.getYear();
		for(int i = 1; i < 13; ++i) {
			Month month = Month.of(i);
			System.out.print("In the year " + year + " the Month " + month.name() + " is ");
			if(dt.isLeapYear()) {
				System.out.println(month.length(true) + " days long.");
			}
			else
				System.out.println(month.length(false) + " days long.");
		}
		
	}
	
	private static void listAllMonInMonth(LocalDate dt) {
		int month = dt.getMonthValue();
		LocalDate start = dt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		int len = Month.of(month).length(dt.isLeapYear());
		int numOfMon = 0;
		for(int i = 0; i < len; ++i) {
			if(start.getDayOfWeek() == DayOfWeek.MONDAY) {
				numOfMon++;
				System.out.println(numOfMon + ". Number of Mondays -> " + start);
			}
			start = start.plusDays(1);
		}
		
	}
	
	private static void isOccurOnFriday13(LocalDate dt) {
		if(dt.getDayOfWeek() == DayOfWeek.FRIDAY && dt.getDayOfMonth() == 13) {
			System.out.println("Today is Friday the 13th!");
		}
		else {
			System.out.println("Today is NOT Friday the 13th!");
		}
		
	}
}
