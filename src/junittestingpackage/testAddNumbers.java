package junittestingpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	 public void test() {
		junitfunction junit = new junitfunction();
		int result =junit.addnumbers(100, 200);
		assertEquals(300,result);

}
}
