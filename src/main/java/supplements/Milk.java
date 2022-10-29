package supplements;

public class Milk implements Supplement {

    protected Milk() {}

    @Override
    public double getPrice() {
        return 0.10;
    }
}
