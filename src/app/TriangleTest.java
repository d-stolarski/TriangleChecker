package app;

import data.Triangle;
import logic.TriangleChecker;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        TriangleChecker tc = new TriangleChecker();

        boolean score = tc.isRightTriangle(triangle1);
        System.out.println("Trójkąt prostokątny?: " + score);
    }
}
