package Builder;

/**
 * @author Soap
 * time 2021-03-07 1:14
 */
public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.preVegMeal();
        Meal chickenMeal = mealBuilder.preChickenMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Cost:" + vegMeal.getCost());

        System.out.println("Chicken Meal");
        chickenMeal.showItems();
        System.out.println("Cost:" + chickenMeal.getCost());
    }
}
