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
		Calendar rightnow = Calendar.getInstance();
		int thisMonth = rightnow.get(Calendar.MONTH)+1;
		int thisYear = rightnow.get(Calendar.YEAR);
		int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
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
	}
}