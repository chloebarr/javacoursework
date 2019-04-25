
package courseworkpizza;


public class TestPizza {
    public static void main(String[] args) 
    {
        Pizza newPizza = new Pizza(size.Medium, crust.Deep, sauce.Tomato, 
                         topping1.Olives, topping2.None);
        System.out.println(newPizza.getPizzaInfo(newPizza));
    }
   

}