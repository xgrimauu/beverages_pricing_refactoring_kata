package beverages;

import supplements.Supplement;

public interface Beverage {

    double price();

    Beverage with(Supplement supplement);
}
