package beverages;

import supplements.Supplement;

import java.util.ArrayList;
import java.util.List;

public class Tea implements Beverage {
    private static final double PRICE = 1.5;
    private List<Supplement> supplements = new ArrayList<>();

    @Override
    public double price() {
        return PRICE + supplements.stream()
                .map(Supplement::getPrice)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    @Override
    public Tea with(final Supplement supplement) {
        supplements.add(supplement);
        return this;
    }
}
