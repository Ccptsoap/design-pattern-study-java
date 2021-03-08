package Builder.FoodItem;

import Builder.AbstractItem.Drink;

/**
 * @author Soap
 * time 2021-03-07 1:04
 */
public class Milk extends Drink {
    private String name = "牛奶";
    private Double price = 3.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
