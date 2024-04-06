package calculator;

import static org.junit.Assert.*;

public class calculatortest {

	@Test
	public void calTest() {
		calculator calTest=new calculator();
		int output=test.add(11,20);
		assertEquals(31, output);
	}
	private void assertEquals(int i, double d) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void calTestSub() {
		assertEquals(30, calculator.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, calculator.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, calculator.div(30, 5));
	}

}
