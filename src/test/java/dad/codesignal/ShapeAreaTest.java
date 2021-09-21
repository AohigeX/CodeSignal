package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapeAreaTest {
	
	EdgeOfTheOcean obj;
	
	@Before
	public void setup() {
		obj = new EdgeOfTheOcean();
	}
	
	@Test
	public void test1() {
		// n = 2
		assertEquals(5, obj.shapeArea(2));
	}
	
	@Test
	public void test2() {
		assertEquals(13, obj.shapeArea(3));
	}
	
	@Test
	public void test3() {
		assertEquals(1, obj.shapeArea(1));
	}
	
	@Test
	public void test4() {
		assertEquals(41, obj.shapeArea(5));
	}
	
	@Test
	public void test5() {
		assertEquals(97986001, obj.shapeArea(7000));
	}
	
	@Test
	public void test6() {
		assertEquals(127984001, obj.shapeArea(8000));
	}
	
	@Test
	public void test7() {
		assertEquals(199940005, obj.shapeArea(9999));
	}
	
	@Test
	public void test8() {
		assertEquals(199900013, obj.shapeArea(9998));
	}
	
	@Test
	public void test9() {
		assertEquals(161946005, obj.shapeArea(8999));
	}
	
	@Test
	public void test10() {
		assertEquals(19801, obj.shapeArea(100));
	}
}
