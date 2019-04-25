
package courseworkpizza;

public class TestOrder {
    public static void main(String[] args) {
        Order newOrder = new Order();
        Pizza pizza1 = new Pizza(size.Small, crust.Stuffed, sauce.Pesto, topping1.None, topping2.None);
        Pizza pizza2 = new Pizza(size.Medium, crust.Stuffed, sauce.Tomato, topping1.Anchovy, topping2.None);
        Pizza pizza3 = new Pizza(size.Large, crust.Deep, sauce.Pesto, topping1.Rocket, topping2.Pepperoni);
        newOrder.addPizza(pizza1);
        newOrder.addPizza(pizza2);
        newOrder.addPizza(pizza3);
        System.out.println("Overall order Total = " + newOrder.getTotalOrderPrice());
        System.out.println(newOrder.showOrder());
        System.out.println(newOrder.getNumberOfPizzasAsString());
        newOrder.deletePizza(3);
        System.out.println("\n"+"*****Deleted a pizza and before updates*****"+
                            "\n"+newOrder.showOrder());
        newOrder.updatePizzaSize(1, size.Medium);
        newOrder.updatePizzaSauce(1, sauce.Tomato);
        newOrder.updatePizzaCrust(2, crust.Deep);
        newOrder.updatePizzaTopping1(2, topping1.None);
        newOrder.updatePizzaTopping2(1, topping2.Extra_Cheese);
        System.out.println(newOrder.showOrder());
    }
}
