package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
	/**
	 * Test that the gets methods work as expected.
	 */
	@Test
	public void test01()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());


		String day= startMonth+"/"+startDay+"/"+startYear + " at ";
		String output="\t"+ day +   "1" +":"+ startMinute + "pm" + " ," +  title+ ", "+  description+"\n";


		assertEquals(output, appt.toString());
	}

	@Test
	public void test02()  throws Throwable  {
		int startHour=30;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(1,
				2,
				3,
				4 ,
				5,
				"none",
				"N/A");
		// assertions
		assertTrue(appt.getValid());

		assertEquals(1, appt.getStartHour());
		assertEquals(2, appt.getStartMinute());
		assertEquals(3, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(5, appt.getStartYear());
		assertEquals("none", appt.getTitle());
		assertEquals("N/A", appt.getDescription());


		//setStart functions
		appt.setStartHour(startHour);
		appt.setStartMinute(startMinute);
		appt.setStartDay(startDay);
		appt.setStartMonth(startMonth);
		appt.setStartYear(startYear);
		appt.setTitle(title);
		appt.setDescription(description);

		assertEquals(30, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());



	}




	@Test

	public void test03()  throws Throwable  {
		int startHour=30;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(30, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
		assertNull(appt.toString());
	}

	@Test

	public void test04()  throws Throwable {
		int startHour = 20;
		int startMinute = 30;
		int startDay = 31;
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
		// assertions
		//assertFalse(appt.getValid());
	}


	@Test

	public void test05()  throws Throwable  {
		int startHour=30;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title=null;
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertEquals(30, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(4, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
		assertNull(appt.toString());
	}


	@Test

	public void test06()  throws Throwable {
		int startHour = 20;
		int startMinute = 60;
		int startDay = 31;
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
		// assertions
		assertFalse(appt.getValid());
	}

	@Test

	public void test07()  throws Throwable {
		int startHour = 20;
		int startMinute = 35;
		int startDay = 31;
		int startMonth = 13;
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
		// assertions
		assertFalse(appt.getValid());
	}

	public void test08()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test09()  throws Throwable  {
		int startHour=25;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(!appt.getValid());
		appt.setStartHour(13);
		assertEquals(13, appt.getStartHour());
		assertTrue(appt.getValid());
		appt.setStartHour(-8);
		assertEquals(-8, appt.getStartHour());
		assertTrue(!appt.getValid());

	}

	@Test
	public void test10()  throws Throwable  {
		int startHour=19;
		int startMinute=-4;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(!appt.getValid());
		appt.setStartMinute(15);
		assertEquals(15, appt.getStartMinute());
		assertTrue(appt.getValid());
		appt.setStartMinute(72);
		assertTrue(!appt.getValid());
		assertEquals(72, appt.getStartMinute());
	}

	@Test
	public void test11()  throws Throwable  {
		int startHour=19;
		int startMinute=10;
		int startDay=33;
		int startMonth=4;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(!appt.getValid());
		appt.setStartDay(23);
		assertEquals(23, appt.getStartDay());
		assertTrue(appt.getValid());
		appt.setStartDay(-5);
		assertEquals(-5, appt.getStartDay());
		assertTrue(!appt.getValid());
	}

	@Test
	public void test12()  throws Throwable  {
		int startHour=19;
		int startMinute=10;
		int startDay=20;
		int startMonth=15;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(!appt.getValid());
		appt.setStartMonth(7);
		assertEquals(7, appt.getStartMonth());
		assertTrue(appt.getValid());
		appt.setStartMonth(-3);
		assertEquals(-3, appt.getStartMonth());
		assertTrue(!appt.getValid());
	}

	@Test
	public void test13()  throws Throwable  {
		int startHour=20;
		int startMinute=15;
		int startDay=20;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals(2017, appt.getStartYear());
		appt.setStartYear(2018);
		assertEquals(2018, appt.getStartYear());
	}

	@Test
	public void test14()  throws Throwable  {
		int startHour=20;
		int startMinute=15;
		int startDay=20;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals("Test Event", appt.getTitle());
		appt.setTitle(null);
		assertEquals("", appt.getTitle());
		appt.setTitle("New Event Name");
		assertEquals("New Event Name", appt.getTitle());
	}

	@Test
	public void test15()  throws Throwable  {
		int startHour=20;
		int startMinute=15;
		int startDay=20;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals("This is a test event", appt.getDescription());
		appt.setDescription(null);
		assertEquals("", appt.getDescription());
		appt.setDescription("New Event Description");
		assertEquals("New Event Description", appt.getDescription());
	}

	@Test
	public void test16()  throws Throwable  {
		int startHour=20;
		int startMinute=-5;
		int startDay=20;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals(null, appt.toString());
		appt.setStartMinute(15);
		assertEquals("\t5/20/2017 at 8:15pm ,Test Event, This is a test event\n", appt.toString());
		appt.setStartHour(8);
		assertEquals("\t5/20/2017 at 8:15am ,Test Event, This is a test event\n", appt.toString());
		appt.setStartHour(0);
		assertEquals("\t5/20/2017 at 12:15am ,Test Event, This is a test event\n", appt.toString());
	}

	////////////////New Tests/////////////////

	@Test
	public void test17() throws Throwable  {
		int startHour=12;
		int startMinute=15;
		int startDay=20;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		assertEquals("\t5/20/2017 at 12:15pm ,Test Event, This is a test event\n", appt.toString());
		appt.setStartHour(11);
		assertEquals("\t5/20/2017 at 11:15am ,Test Event, This is a test event\n", appt.toString());
	}

	@Test
	public void test18() throws Throwable  {
		int startHour=-1;
		int startMinute=15;
		int startDay=20;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		assertTrue(!appt.getValid());
		appt.setStartHour(0);
		assertTrue(appt.getValid());
		appt.setStartHour(23);
		assertTrue(appt.getValid());
	}

	@Test
	public void test19() throws Throwable  {
		int startHour=10;
		int startMinute=-1;
		int startDay=20;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		assertTrue(!appt.getValid());
		appt.setStartMinute(0);
		assertTrue(appt.getValid());
		appt.setStartMinute(59);
		assertTrue(appt.getValid());
		appt.setStartMinute(60);
		assertTrue(!appt.getValid());
	}

	@Test
	public void test20() throws Throwable  {
		int startHour=10;
		int startMinute=15;
		int startDay=0;
		int startMonth=5;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		assertTrue(!appt.getValid());
		appt.setStartDay(1);
		assertTrue(appt.getValid());
		appt.setStartDay(31);
		assertTrue(appt.getValid());
		appt.setStartDay(32);
		assertTrue(!appt.getValid());
	}

	@Test
	public void test21() throws Throwable  {
		int startHour=10;
		int startMinute=15;
		int startDay=10;
		int startMonth=0;
		int startYear=2017;
		String title="Test Event";
		String description="This is a test event";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		assertTrue(!appt.getValid());
		appt.setStartMonth(1);
		assertTrue(appt.getValid());
		appt.setStartMonth(12);
		assertTrue(appt.getValid());
		appt.setStartMonth(13);
		assertTrue(!appt.getValid());
	}
}