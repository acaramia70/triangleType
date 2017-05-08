package triangletype.triangle;

import java.math.BigDecimal;

public class Triangle {
	
	//Types of triangle
	public enum TriangleType {
	    EQUILATERAL, ISOSCELES, SCALENE
	}
	
	// Stores the length of each side of the Triangle object.
	private BigDecimal side1, side2, side3;
	
	// Store the triangle type.
	private TriangleType type;
	
	// Constructor with no parameters.
	public Triangle () {
	}

	// Constructor to initialize the sides of the triangle.
	public Triangle (BigDecimal s1, BigDecimal s2, BigDecimal s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	public BigDecimal getSide1() {
		return side1;
	}

	public void setSide1(BigDecimal side1) {
		this.side1 = side1;
	}

	public BigDecimal getSide2() {
		return side2;
	}

	public void setSide2(BigDecimal side2) {
		this.side2 = side2;
	}

	public BigDecimal getSide3() {
		return side3;
	}

	public void setSide3(BigDecimal side3) {
		this.side3 = side3;
	}

	public TriangleType getType() {
		return type;
	}
	
	// Method to calculate triangle type
	public void calculateType() {
		if (isScalene())
			type = TriangleType.SCALENE;
		else if (isIsosceles())
			type = TriangleType.ISOSCELES;
		else if (isEquilateral())
			type = TriangleType.EQUILATERAL;
	}

	// Method to check sides correctness
	public void checkSides() throws TriangleException {
		if (side1.compareTo(BigDecimal.ZERO) <= 0 || 
			side2.compareTo(BigDecimal.ZERO) <= 0 ||
		    side3.compareTo(BigDecimal.ZERO) <= 0)
			throw new TriangleException("The lenghts of any sides must be greater than 0", 
					side1 + " " + side2 + " " + side3);
		if (side1.compareTo(side2.add(side3)) > 0 || 
			side2.compareTo(side1.add(side3)) > 0 ||
			side3.compareTo(side1.add(side2)) > 0)
			throw new TriangleException("The sum of the lengths of any two sides "
					+ "must be greater than or equal to the length of the remaining side",
					side1 + " " + side2 + " " + side3);
	}

	// Method to test for a scalene triangle.
	public boolean isScalene() {
		if (!side1.equals(side2) && !side1.equals(side3) && !side2.equals(side3))
			return true;
		else
			return false;
	}

	// Method to test for an isosceles triangle.
	public boolean isIsosceles() {
		if ((side1.equals(side2) && !side1.equals(side3)) ||
			(side1.equals(side3) && !side1.equals(side2)) ||
			(side2.equals(side3) && !side2.equals(side1)))
			return true;
		else
			return false;
	}

	// Method to test for an equilateral triangle.
	public boolean isEquilateral () {
		if (side1.equals(side2) && side1.equals(side3))
			return true;
		else
			return false;
	}

}
