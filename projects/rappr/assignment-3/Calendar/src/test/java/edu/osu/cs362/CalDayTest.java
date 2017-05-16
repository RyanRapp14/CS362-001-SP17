package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {


	@Test
	public void test01()  throws Throwable  {
		CalDay calendarDay = new CalDay();
		// assertions
		assertFalse(calendarDay.isValid());
	}


	@Test
	public void test02() {
		GregorianCalendar calendar = new GregorianCalendar(2018, 6, 17);
		CalDay calendarDay = new CalDay(calendar);

		// assertions
		assertEquals(2018, calendarDay.year);
		assertEquals(6, calendarDay.month);
		assertEquals(17, calendarDay.day);
	}


	@Test
	public void test03() {
		int year = 2017,
				month = 7,
				day = 1;

		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		CalDay calendarDay = new CalDay(calendar);
		Appt appointment1 = new Appt(6, 45, day, month, year, "Wake Up", null),
				appointment2 = new Appt(22, 45, day, month, year, "Go to Sleep", null);

		calendarDay.addAppt(appointment1);
		calendarDay.addAppt(appointment2);

		//Iterator<?> apptsIterator = calendarDay.iterator();

		// assertions
		//assertEquals(appointment1, apptsIterator.next());
		//assertEquals(appointment2, apptsIterator.next());

		//calendarDay = new CalDay();
		//assertEquals(null, calendarDay.iterator());
	}


	@Test
	public void test04() {
		int year = 2017,
				month = 5,
				day = 25;
		GregorianCalendar gregCalendar = new GregorianCalendar(year, month, day);
		CalDay calendarDay = new CalDay(gregCalendar);

		// assertions
		assertEquals(year, calendarDay.getYear());
		assertEquals(month, calendarDay.getMonth());
		assertEquals(day, calendarDay.getDay());
	}


	@Test
	public void test05() {
		int year = 2017,
				month  = 8,
				day = 2;

		GregorianCalendar gregCalendar = new GregorianCalendar(year, month, day);
		CalDay calendarDay = new CalDay(gregCalendar);

		Appt appointment1 = new Appt(12,30, day, month, year, "First", null),
				appointment2 = new Appt(14, 45, day, month, year, "Second", null),
				invalidAppointment = new Appt(3000, 0, day, month, year, "Invalid", null);

		// assertions
		assertTrue(appointment1.getValid());
		assertTrue(appointment2.getValid());
		assertEquals(0, calendarDay.getSizeAppts());

		calendarDay.addAppt(appointment1);
		assertEquals(appointment1, calendarDay.getAppts().getFirst());

		calendarDay.addAppt(appointment2);
		assertEquals(appointment2, calendarDay.getAppts().getLast());

		int size = calendarDay.getSizeAppts();
		calendarDay.addAppt(invalidAppointment);
		assertEquals(size, calendarDay.getSizeAppts());
	}



	@Test
	public void test07() {
		int year = 2017,
				month  = 5,
				day = 26;

		GregorianCalendar gregCalendar = new GregorianCalendar(year, month, day);
		CalDay calendarDay = new CalDay(gregCalendar);

		Appt 	appointment1 = new Appt(18, 10, day, month, year, "Evening", null),
				appointment2 = new Appt(7, 30, day, month, year, "Morning", null);

		calendarDay.addAppt(appointment1);
		calendarDay.addAppt(appointment2);

		// assertions
		assertEquals(2, calendarDay.getSizeAppts());
		assertEquals("\t --- 5/26/2017 --- \n" + " --- -------- Appointments ------------ --- \n" + "\t5/26/2017 at 7:30am ,Morning, \n" + " \t5/26/2017 at 6:10pm ,Evening, \n" + " \n", calendarDay.toString());

		calendarDay.valid = false;
		assertEquals("", calendarDay.toString());
	}


	@Test
	public void test08()  throws Throwable  {
		GregorianCalendar cal = new GregorianCalendar(2017,3,22);
		CalDay day = new CalDay(cal);
		assertTrue(day.isValid());
		int startHour=13;
		int startMinute=30;
		int startDay=22;
		int startMonth=3;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt);

		assertEquals(1, day.getSizeAppts());
		assertEquals(22, day.getDay());
		assertEquals(3, day.getMonth());
		assertEquals(2017, day.getYear());
		assertTrue(day.isValid());

	}

	@Test
	public void test09()  throws Throwable  {
		GregorianCalendar cal = new GregorianCalendar(2017,3,22);
		CalDay day = new CalDay(cal);
		assertEquals(day.getSizeAppts(),0);
		int startHour=13;
		int startMinute=30;
		int startDay=22;
		int startMonth=3;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		day.addAppt(appt);
		assertEquals(startDay,day.getDay());
		assertEquals(startMonth,day.getMonth());
		assertEquals(startYear,day.getYear());
		String todayDate = (day.getMonth()) + "/" + day.getDay() + "/" + day.getYear();

		assertEquals(day.toString(),"\t --- " +todayDate+" --- \n"+" --- -------- Appointments ------------ --- \n"+appt.toString()+" \n");


	}

	@Test
	public void test10()  throws Throwable  {
		GregorianCalendar cal = new GregorianCalendar(2017,3,22);
		CalDay day = new CalDay(cal);

		int startHour=13;
		int startMinute=30;
		int startDay=22;
		int startMonth=3;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt);
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt2);

		assertEquals(2, day.getSizeAppts());
	}
	@Test
	public void test11()  throws Throwable  {
		GregorianCalendar cal = new GregorianCalendar(2017,3,22);
		CalDay day = new CalDay(cal);

		int startHour=13;
		int startMinute=30;
		int startDay=22;
		int startMonth=3;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt);
		startHour=11;
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt2);
		assertEquals(day.getAppts().get(0),appt2);

	}
	@Test
	public void test12()  throws Throwable  {
		GregorianCalendar cal = new GregorianCalendar(2017,3,22);
		CalDay day = new CalDay(cal);

		int startHour=13;
		int startMinute=30;
		int startDay=22;
		int startMonth=3;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt);
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt2);
		assertEquals(day.getAppts().get(1),appt2);

	}

	@Test
	public void test13()  throws Throwable  {
		GregorianCalendar cal = new GregorianCalendar(2017,3,22);
		CalDay day = new CalDay(cal);
		CalDay day2 = new CalDay();

		int startHour=13;
		int startMinute=30;
		int startDay=22;
		int startMonth=3;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt);
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		day.addAppt(appt2);



	}


}