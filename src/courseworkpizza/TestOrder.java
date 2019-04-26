
package courseworkpizza;

public class TestOrder {
    public static void main(String[] args){
        //create an order and some pizzas
        Order newOrder = new Order();
        Pizza pizza1 = new Pizza(size.Small, crust.Stuffed, sauce.Pesto, 
                                topping1.None, topping2.None);
        Pizza pizza2 = new Pizza(size.Medium, crust.Stuffed, sauce.Tomato, 
                                topping1.Anchovy, topping2.None);
        Pizza pizza3 = new Pizza(size.Large, crust.Deep, sauce.Pesto, 
                                topping1.Rocket, topping2.Pepperoni);
        //add the pizzas to the order
        newOrder.addPizza(pizza1);
        newOrder.addPizza(pizza2);
        newOrder.addPizza(pizza3);
        //print the order total 
        String firstAction = "**** Print the overall price of a new order ****"
                + " \n \n";
        System.out.println(firstAction + "Overall order Total = " 
                + newOrder.getTotalOrderPrice());
        //Show the order as a formatted string
        String secondAction = "\n**** Show the whole order **** \n \n" ;
        System.out.println(secondAction + newOrder.showOrder());
        //Show the number of pizzas
        String thirdAction = "\n**** Show the number of pizzas **** \n \n";
        System.out.println(thirdAction + newOrder.getNumberOfPizzasAsString());
        //delete a pizza
        newOrder.deletePizza(3);
        String fourthAction = "\n**** Pizza three has been deleted *****\n \n";
        System.out.println(fourthAction + newOrder.showOrder());
        //update pizzas
        String fifthAction = "\n**** Update pizza number 1 to size Medium, "
                + "with tomato sauce and topping 2 to Extra cheese ****\n \n" 
                + "**** Update Pizza 2 to Deep crust and no topping 1 ****\n\n";
        
        newOrder.updatePizzaSize(1, size.Medium);
        newOrder.updatePizzaSauce(1, sauce.Tomato);
        newOrder.updatePizzaCrust(2, crust.Deep);
        newOrder.updatePizzaTopping1(2, topping1.None);
        newOrder.updatePizzaTopping2(1, topping2.Extra_Cheese);
        System.out.println(fifthAction + newOrder.showOrder());
        //add another pizza
        String sixthAction = "\n**** Add a Pizza ****\n \n";
        newOrder.addPizza(pizza3);
        System.out.println(sixthAction + newOrder.showOrder());
    }
}
