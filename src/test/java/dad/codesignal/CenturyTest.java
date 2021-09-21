package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyTest {
	
	TheJourneyBegins obj;
	
	@Before
	public void setup() {
		obj = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(21, obj.centuryFromYear(2021));
	}
	
	@Test
	public void test2() {
		assertEquals(17, obj.centuryFromYear(1700));
	}
	
	@Test
	public void test3() {
		assertEquals(20, obj.centuryFromYear(1988));
	}
	
	@Test
	public void test4() {
		assertEquals(21, obj.centuryFromYear(2001));
	}
	
	@Test
	public void test5() {
		assertEquals(2, obj.centuryFromYear(200));
	}
	
	@Test
	public void test6() {
		assertEquals(3, obj.centuryFromYear(201));
	}
	
}
