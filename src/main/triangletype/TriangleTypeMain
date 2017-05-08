package triangletype;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

import triangletype.triangle.Triangle;
import triangletype.triangle.TriangleException;

/**
 * Main class for calculating triangle type
 */
public class TriangleTypeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
        while (sc.hasNextDouble()) {
        	BigDecimal side1 = new BigDecimal(String.valueOf(sc.nextDouble()));
        	BigDecimal side2 = new BigDecimal(String.valueOf(sc.nextDouble()));
        	BigDecimal side3 = new BigDecimal(String.valueOf(sc.nextDouble()));
        	Triangle triangle = new Triangle(side1, side2, side3);
        	try {
				triangle.checkSides();
				triangle.calculateType();
				System.out.println(triangle.getType());
			} catch (TriangleException e) {
				System.err.println(e.toString());
			}
        }
	}

}
