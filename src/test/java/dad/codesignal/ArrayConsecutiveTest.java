package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayConsecutiveTest {
	
	EdgeOfTheOcean obj;
	@Before
	public void setup() {
		obj = new EdgeOfTheOcean();
	}
	
	@Test
	public void test1() {
		int[] statues = new int[] {6, 2, 3, 8};
		// statues statues: [6, 2, 3, 8]
		assertEquals(3, obj.makeArrayConsecutive2(statues));
	}
	
	@Test
	public void test2() {
		// statues: [0,3]
		int[] statues = new int[] {0,3};
		assertEquals(2, obj.makeArrayConsecutive2(statues));
	}
	
	@Test
	public void test3() {
		// statues: [5, 4, 6]
		int[] statues = new int[] {5, 4, 6};
		assertEquals(0, obj.makeArrayConsecutive2(statues));
	}
	
	@Test
	public void test4() {
		// statues: [6,3]
		int[] statues = new int[] {6,3};
		assertEquals(2, obj.makeArrayConsecutive2(statues));
	}
	
	@Test
	public void test5() {
		// statues: [1]
		int[] statues = new int[] {1};
		assertEquals(0, obj.makeArrayConsecutive2(statues));
	}
	
	@Test
	public void test6() {
		// statues: [8, 1, 0, 4, 7]
		int[] statues = new int[] {8,1,0,4,7};
		assertEquals(4, obj.makeArrayConsecutive2(statues));
	}
	
}
