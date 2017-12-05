package logic;

import data.Triangle;

public class TriangleChecker {

    public boolean isRightTriangle(Triangle triangle) {

        double theGreatestDimension;
        double shorterDimension1;
        double shorterDimension2;

        if (triangle.getDimensionA() > triangle.getDimensionB() && triangle.getDimensionA() > triangle.getDimensionC()) {
            theGreatestDimension = triangle.getDimensionA();
            shorterDimension1 = triangle.getDimensionB();
            shorterDimension2 = triangle.getDimensionC();
            return Math.pow(shorterDimension1, 2) + Math.pow(shorterDimension2, 2) == Math.pow(theGreatestDimension, 2);

        } else if (triangle.getDimensionB() > triangle.getDimensionA() && triangle.getDimensionB() > triangle.getDimensionC()) {
            theGreatestDimension = triangle.getDimensionB();
            shorterDimension1 = triangle.getDimensionA();
            shorterDimension2 = triangle.getDimensionC();
            return Math.pow(shorterDimension1, 2) + Math.pow(shorterDimension2, 2) == Math.pow(theGreatestDimension, 2);

        } else {
            theGreatestDimension = triangle.getDimensionC();
            shorterDimension1 = triangle.getDimensionA();
            shorterDimension2 = triangle.getDimensionB();
            return Math.pow(shorterDimension1, 2) + Math.pow(shorterDimension2, 2) == Math.pow(theGreatestDimension, 2);
        }

    }


}
