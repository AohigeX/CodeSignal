package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {
	
	TheJourneyBegins obj;
	@Before
	public void setup() {
		obj = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(true, obj.checkPalindrome("aabaa"));
	}
	
	@Test
	public void test2() {
		assertEquals(false, obj.checkPalindrome("abac"));
	}
	
	@Test
	public void test3() {
		assertEquals(true, obj.checkPalindrome("a"));
	}
	
	@Test
	public void test4() {
		assertEquals(false, obj.checkPalindrome("az"));
	}
	
	@Test
	public void test5() {
		assertEquals(true, obj.checkPalindrome("abacaba"));
	}
	
	@Test
	public void test6() {
		assertEquals(true, obj.checkPalindrome("z"));
	}
	
	@Test
	public void test7() {
		assertEquals(false, obj.checkPalindrome("aaabaaaa"));
	}
	
	@Test
	public void test8() {
		assertEquals(false, obj.checkPalindrome("zzzazzazz"));
	}
	
	@Test
	public void test9() {
		assertEquals(true, obj.checkPalindrome("hlbeeykoqqqqokyeeblh"));
	}
	
	public void test10() {
		assertEquals(true, obj.checkPalindrome("hlbeeykoqqqokyeeblh"));
	}
}
