package powerpackage;

public class PowerFinder {
    public int of(int number, int exponent) {
        int power = 1;
        for (int i = 0; i<exponent; i++) {
            power *= number;
        }
        return power;
    }
}
