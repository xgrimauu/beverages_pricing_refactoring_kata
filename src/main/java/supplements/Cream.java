package supplements;

public class Cream implements Supplement {

    protected Cream() {
    }

    @Override
    public double getPrice() {
        return 0.15;
    }
}
