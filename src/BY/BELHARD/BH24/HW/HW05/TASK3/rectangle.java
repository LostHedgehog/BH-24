package BY.BELHARD.BH24.HW.HW05.TASK3;

public class rectangle extends Figure{

    private double sideA, sideB;

    public rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
