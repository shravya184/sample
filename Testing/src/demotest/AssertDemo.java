package demotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertDemo {
	@Test
void testAssertTrue()
{
	assertTrue("Hello".contains("m"));
}
	@Test
	void assertEqualsMethod() {
		int res=1;
		int exp=1;
		assertEquals(res,exp);
	}
	void testNull() {
		String s=null;
		assertNull(0);
	}
}
