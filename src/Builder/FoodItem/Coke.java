package Builder.FoodItem;

import Builder.AbstractItem.Drink;

/**
 * @author Soap
 * time 2021-03-07 1:02
 */
public class Coke extends Drink {
    private String name = "可乐";
    private Double price = 2.5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
