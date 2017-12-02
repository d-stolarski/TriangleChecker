public class Triangle {
    private double dimensionA;
    private double dimensionB;
    private double dimensionC;

    public Triangle(double dimensionA, double dimensionB, double dimensionC){
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
        this.dimensionC = dimensionC;
    }

    public void setDimensionA(double dimensionA){
        this.dimensionA = dimensionA;
    }

    public double getDimensionA(){
        return dimensionA;
    }

    public void setDimensionB(double dimensionB) {
        this.dimensionB = dimensionB;
    }

    public double getDimensionB() {
        return dimensionB;
    }

    public void setDimensionC(double dimensionC) {
        this.dimensionC = dimensionC;
    }

    public double getDimensionC() {
        return dimensionC;
    }
}
