package triangletype.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import triangletype.triangle.Triangle;
import triangletype.triangle.Triangle.TriangleType;
import triangletype.triangle.TriangleException;

public class TriangleTypeTest {

	/**
	 * Test scalene triangle type
	 */
	@Test
	public void testScaleneTriangleType() throws Exception {
		BigDecimal side1 = new BigDecimal(String.valueOf(2.4));
    	BigDecimal side2 = new BigDecimal(String.valueOf(3.5));
    	BigDecimal side3 = new BigDecimal(String.valueOf(2.3));
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.checkSides();
		triangle.calculateType();
		assertEquals("Wrong triangle type", TriangleType.SCALENE, triangle.getType());
	}

	/**
	 * Test isosceles triangle type
	 */
	@Test
	public void testIsoscelesTriangleType() throws Exception {
		BigDecimal side1 = new BigDecimal(String.valueOf(2.3));
    	BigDecimal side2 = new BigDecimal(String.valueOf(3.5));
    	BigDecimal side3 = new BigDecimal(String.valueOf(2.3));
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.checkSides();
		triangle.calculateType();
		assertEquals("Wrong triangle type", TriangleType.ISOSCELES, triangle.getType());
	}
	
	/**
	 * Test equilateral triangle type
	 */
	@Test
	public void testEquilateralTriangleType() throws Exception {
		BigDecimal side1 = new BigDecimal(String.valueOf(4.2));
    	BigDecimal side2 = new BigDecimal(String.valueOf(4.2));
    	BigDecimal side3 = new BigDecimal(String.valueOf(4.2));
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.checkSides();
		triangle.calculateType();
		assertEquals("Wrong triangle type", TriangleType.EQUILATERAL, triangle.getType());
	}
	
	/**
	 * Test triangle with side less or equal to 0
	 */
	@Test(expected=TriangleException.class)
	public void testTriangleException1() throws Exception {
		BigDecimal side1 = new BigDecimal(String.valueOf(0));
    	BigDecimal side2 = new BigDecimal(String.valueOf(3.1));
    	BigDecimal side3 = new BigDecimal(String.valueOf(4.2));
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.checkSides();
		triangle.calculateType();
	}
	
	/**
	 * Test triangle with side greater than sum of remaining sides
	 */
	@Test(expected=TriangleException.class)
	public void testTriangleException2() throws Exception {
		BigDecimal side1 = new BigDecimal(String.valueOf(5.5));
    	BigDecimal side2 = new BigDecimal(String.valueOf(2));
    	BigDecimal side3 = new BigDecimal(String.valueOf(3.1));
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.checkSides();
		triangle.calculateType();
	}
	
}
