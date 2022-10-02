package ToppingsDecorator;

import BasePizza.BasePizza;

public class Mushrooms extends ToppingsDecorator{

    BasePizza basePizza;
    public Mushrooms(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+15;
    }
}
