package beverages;

import supplements.Supplement;

import java.util.ArrayList;
import java.util.List;

public class HotChocolate implements Beverage {

    private List<Supplement> supplements = new ArrayList<>();
    private static final double PRICE = 1.45;
    @Override
    public double price() {
        return PRICE + supplements.stream()
                .map(Supplement::getPrice)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    @Override
    public HotChocolate with(final Supplement supplement) {
        supplements.add(supplement);
        return this;
    }
}
