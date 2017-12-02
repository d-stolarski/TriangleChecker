package logic;

import data.Triangle;

public class TriangleChecker {

    public boolean isRightTriangle(Triangle triangle){
        boolean score = false;
        if(triangle.getDimensionA() == triangle.getDimensionB()) {
            score = true;
        } else if(triangle.getDimensionA() == triangle.getDimensionC()) {
            score = true;
        } else if(triangle.getDimensionB() == triangle.getDimensionC()) {
            score = true;
        } else {
            score = false;
        }
        return score;
    }
}
