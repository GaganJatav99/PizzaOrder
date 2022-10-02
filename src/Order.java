import BasePizza.BasePizza;
import BasePizza.*;
import ToppingsDecorator.ExtraCheese;
import ToppingsDecorator.Mushrooms;

public class Order {
    public static void main(String[] args) {

        BasePizza pizza = new Mushrooms(new ExtraCheese(new Margherita()));
        System.out.println("Order cost:"+pizza.cost());

    }
}
