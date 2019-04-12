package junittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	 public void test() {
		junitfunction junitstring = new junitfunction();
		String result =junitstring.addstring("abcd", "efgh");
		assertEquals("abcdefgh",result);
		
	}

}
