package beverages;

import supplements.Supplement;

import java.util.ArrayList;
import java.util.List;

public class Coffee implements Beverage {

    private List<Supplement> supplements = new ArrayList<>();
    private static final double PRICE = 1.2;
    @Override
    public double price() {
        return PRICE + supplements.stream()
                .map(Supplement::getPrice)
                .reduce(Double::sum)
                .orElse(0.0);
    }
    @Override
    public Coffee with(final Supplement supplement) {
        this.supplements.add(supplement);
        return this;
    }


}
