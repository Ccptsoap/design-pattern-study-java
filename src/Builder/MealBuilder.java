package Builder;

import Builder.FoodItem.ChickenBurger;
import Builder.FoodItem.Coke;
import Builder.FoodItem.Milk;
import Builder.FoodItem.VegBurger;

/**
 * @author Soap
 * time 2021-03-07 1:12
 * 组装套餐
 */
public class MealBuilder {
    public Meal preVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Milk());
        return meal;
    }
    public Meal preChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
