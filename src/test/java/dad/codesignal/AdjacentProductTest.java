package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdjacentProductTest {
	
	EdgeOfTheOcean obj;
	
	@Before
	public void setup() {
		obj = new EdgeOfTheOcean();
	}
	
	@Test
	public void test1() {
		// inputArray: [3, 6, -2, -5, 7, 3]
		int[] array = new int[] {
				3, 6, -2, -5, 7, 3
		};
		assertEquals(21, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test2() {
		// inputArray: [-1, -2]
		int[] array = new int[] {
				-1, -2
		};
		assertEquals(2, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test3() {
		// inputArray: [5, 1, 2, 3, 1, 4]
		int[] array = new int[] {5,1,2,3,1,4};
		assertEquals(6, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test4() {
		// inputArray: [1, 2, 3, 0]
		int[] array = new int[] {1,2,3,0};
		assertEquals(6, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test5() {
		// inputArray: [9, 5, 10, 2, 24, -1, -48]
		int[] array = new int[] {9,5,10,2,24,-1,-48};
		assertEquals(50, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test6() {
		// inputArray: [5, 6, -4, 2, 3, 2, -23]
		int[] array = new int[] {5,6,-4,2,3,2,-23};
		assertEquals(30, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test7() {
		// inputArray: [4, 1, 2, 3, 1, 5]
		int[] array = new int[] {4,1,2,3,1,5};
		assertEquals(6, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test8() {
		// inputArray: [-23, 4, -3, 8, -12]
		int[] array = new int[] {-23,4,-3,8,-12};
		assertEquals(-12, obj.adjacentElementsProduct(array));
	}
	
	@Test
	public void test9() {
		// inputArray: [1, 0, 1, 0, 1000]	
		int[] array = new int[] {1,0,1,0,1000};
		assertEquals(0, obj.adjacentElementsProduct(array));
	}
	
}
