package Builder.FoodItem;

import Builder.AbstractItem.Burger;

/**
 * @author Soap
 * time 2021-03-07 0:58
 */
public class ChickenBurger extends Burger {
    private String name = "鸡肉汉堡";
    private double price = 20.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
