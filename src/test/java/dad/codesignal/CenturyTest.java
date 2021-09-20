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
		assertEquals(1, obj.centuryFromYear(100));
	}
	
	@Test
	public void test3() {
		assertEquals(6, obj.centuryFromYear(501));
	}
}
