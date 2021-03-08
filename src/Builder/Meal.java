package Builder;

import Builder.Imp.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Soap
 * time 2021-03-07 1:05
 * 套餐类
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public double getCost(){
        double cost = 0.0;
        for (Item item:items){
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.getName());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.getPrice());
        }
    }
}
