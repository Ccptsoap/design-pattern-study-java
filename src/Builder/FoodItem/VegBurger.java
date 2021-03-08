package Builder.FoodItem;

import Builder.AbstractItem.Burger;

/**
 * @author Soap
 * time 2021-03-07 0:55
 */
public class VegBurger extends Burger {
    private String name = "蔬菜汉堡";
    private Double price = 15.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
