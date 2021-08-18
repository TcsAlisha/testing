package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTesting {
//A-Arrange
//A-Art
//A-Assert
	Calculator calculator;//arrange
	@BeforeEach
	void init() {
		calculator = new Calculator();
		System.out.println("Init");
	}
	@Test
	void testAdd() {
		int result = calculator.add(1, 3);//act
		assertEquals(4, result,"Test Failed");
	}
	@Test
	void testAddIfCondition() {
		float result = calculator.add(5.2F, 3.1F);//act
		assertEquals(8.3, result,0.000002);
	}
	@Test
	void testAddFloat() {
		float result = calculator.add(1.2F, 3.1F);//act
		assertEquals(4.3F, result);
	}
	@Test
	void testAddOnePositiveOneNegative() {
		int result = calculator.add(1, -3);//act
		assertEquals(-2, result,"Test Failed");
	}
	@Test
	void testAddBothNegatives() {
		int result = calculator.add(-1, -3);//act
		assertEquals(-4, result,"Test Failed");
	}
	@Test
	void testDivide() {
		float result = calculator.divide(2, 4);//act
		assertEquals(0, result, "Test Failed");
	}
	@Test
	void testDivideWhenDenominatorIsZero() {
		try {
			calculator.divide(1, 1);//act
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		} 
	}
}
