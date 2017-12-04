package logic;

import data.Triangle;

public class TriangleChecker {

    public boolean isRightTriangle(Triangle triangle){
        boolean score = false;
        if(triangle.getDimensionA() * triangle.getDimensionA() + (triangle.getDimensionB() * triangle.getDimensionB())
                == triangle.getDimensionC() * triangle.getDimensionC()) {
            score = true;
        } else {
            score = false;
        }
        return score;
    }
}
