package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	@Test
	public void test00()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct new linked list objects
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		//Construct a new TimeTable object
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals(null, timeTable.deleteAppt(listAppts, appt));
		appts=null;
		assertEquals(null, timeTable.deleteAppt(appts, appt));
	}

	@Test
	public void test01()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new linked list object
		LinkedList<Appt> appts = new LinkedList<Appt>();
		//Construct a new TimeTable object
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		appt=null;
		assertEquals(null, timeTable.deleteAppt(appts, appt));
	}

	@Test
	public void test02()  throws Throwable  {
		int startHour=0;
		int startMinute=0;
		int startDay=0;
		int startMonth=0;
		int startYear=0;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new linked list object
		LinkedList<Appt> appts = new LinkedList<Appt>();
		//Construct a new TimeTable object
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals(null, timeTable.deleteAppt(appts, appt));
	}

	@Test
	public void test03()  throws Throwable  {
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=15;
		int startMinute=30;
		int startDay=thisDay;
		int startMonth=thisMonth;
		int startYear=thisYear;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct today and tomorrow objects
		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		tomorrow.add(Calendar.DAY_OF_MONTH,1);
		//Construct a new TimeTable object
		TimeTable timeTable=new TimeTable();
		//Construct new linked list objects
		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		LinkedList<GregorianCalendar> result = new LinkedList<GregorianCalendar>();
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		// create another appointment
		startHour=13;
		startMinute=30;
		startDay=thisDay;
		startMonth=thisMonth;
		startYear=thisYear;
		title="Meeting Today";
		description="Meeting with the students.";
		//Construct a new Appointment object with the initial data
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		listAppts.add(appt);
		// assertions
		timeTable.getApptRange(listAppts,today,tomorrow);
		timeTable.deleteAppt(listAppts, appt);
	}

	@Test
	public void test04()  throws Throwable  {
		/*Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=1;
		int startMonth=1;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct today and tomorrow objects
		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
		GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		//Construct new linked lists objects
		LinkedList<Appt> appts = new LinkedList<Appt>();
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		//Construct a new TimeTable object
		TimeTable timeTable=new TimeTable();
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		timeTable.getApptRange(listAppts,today,tomorrow);
		*/
	}


	@Test
	public void test05()  throws Throwable  {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;

		String title = "Birthday Party";
		String description = "This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		startHour = 15;
		startMinute = 35;
		startDay = 15;
		startMonth = 9;
		startYear = 2020;
		title = "Birthday Party";
		description = "This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt apptS = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2000, 3, 10, 10, 10 , 15);

		CalDay calDay = new CalDay(cal);
		calDay.addAppt(appt);
		calDay.addAppt(apptS);

		GregorianCalendar gCal = new GregorianCalendar();
		gCal.set(2000, 3, 11, 11, 11, 11);

		GregorianCalendar goCal = new GregorianCalendar();
		gCal.set(2020, 5, 15, 15, 15, 15);

		TimeTable timeTable = new TimeTable();
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, goCal));
		assertNotEquals(null, timeTable.deleteAppt(calDay.getAppts(), appt));

		startHour = 10;
		startMinute = 10;
		startDay = 40;
		startMonth = 10;
		startYear = 2020;
		title = "Birthday Party";
		description = "This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt apptY = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);


		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);

		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		assertEquals(null, timeTable.deleteAppt(null, null ) );
		assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), null ) );

		startDay = 10;
		apptY = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);


		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);

	}

	@Test
	public void test06()  throws Throwable  {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;

		String title = "Birthday Party";
		String description = "This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		startHour = 15;
		startMinute = 35;
		startDay = 9;
		startMonth = 9;
		startYear = 2020;
		title = "Birthday Party";
		description = "This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt apptS = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2000, 3, 10, 10, 10 , 15);

		CalDay calDay = new CalDay(cal);
		calDay.addAppt(appt);
		calDay.addAppt(apptS);

		GregorianCalendar gCal = new GregorianCalendar();
		gCal.set(2000, 3, 11, 11, 11, 11);

		GregorianCalendar goCal = new GregorianCalendar();
		gCal.set(2020, 5, 9, 15, 15, 15);

		TimeTable timeTable = new TimeTable();
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, goCal));
		assertNotEquals(null, timeTable.deleteAppt(calDay.getAppts(), appt));

		startHour = 10;
		startMinute = 10;
		startDay = 40;
		startMonth = 10;
		startYear = 2020;

		title = "Birthday Party";
		description = "This is my birthday party.";

		//Construct a new Appointment object with the initial data
		Appt apptY = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);


		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);

		timeTable.getApptRange(calDay.getAppts(), cal, gCal);

		assertEquals(null, timeTable.deleteAppt(null, null ) );
		assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), null ) );

		startDay = 10;
		apptY = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);


		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);

	}

	@Test
	public void test07()  throws Throwable  {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt( 1, 1, 1, 1, 1, null, null);

		//Construct a new Appointment object with the initial data
		Appt apptS = new Appt( 1,1,1,1,1, " ", " ");

		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2000, 3, 10, 10, 10 , 15);

		CalDay calDay = new CalDay(cal);
		calDay.addAppt(appt);
		calDay.addAppt(apptS);

		GregorianCalendar gCal = new GregorianCalendar();
		gCal.set(2000, 3, 11, 11, 11, 11);

		GregorianCalendar goCal = new GregorianCalendar();
		gCal.set(2020, 5, 15, 15, 15, 15);

		TimeTable timeTable = new TimeTable();
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, goCal));
		assertNotEquals(null, timeTable.deleteAppt(calDay.getAppts(), appt));

		//Construct a new Appointment object with the initial data
		Appt apptY = new Appt(150, 150, 150, 150, 150, "a", "a");


		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);

		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		assertEquals(null, timeTable.deleteAppt(null, null ) );
		assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), null ) );

		apptY = new Appt( -1, -1, -1, -1, -1, "lol", "not today");

		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);
	}

}