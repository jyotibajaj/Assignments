package testProgrammingAssignment.com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import practicecode.com.InputNumber;


public class InputNumberTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testReturnSum() {
		InputNumber number = new InputNumber();
		int expected = 6;
		int actual = number.returnSum(3);
		Assert.assertEquals(expected, actual);

	}

}
