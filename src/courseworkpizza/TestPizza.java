
package courseworkpizza;


public class TestPizza {
    public static void main(String[] args){
        //Create new pizza
        Pizza newPizza = new Pizza(size.Medium, crust.Deep, sauce.Tomato, 
                         topping1.Olives, topping2.None);
        //Show new pizza information
        System.out.println(newPizza.getPizzaInfo(newPizza) + "\n");
        //Create a second pizza to show that all values can change
        String outputInfo = "********************************************** \n"
                + "A second pizza to show that all values can change ";
        Pizza pizza2 = new Pizza(size.Large, crust.Thin, sauce.Pesto, 
                topping1.Mushroom, topping2.Pepperoni);
        System.out.println(outputInfo +"\n \n"+ pizza2.getPizzaInfo(pizza2));
        String outputInfo2 = "\n******************************************** \n"
                + "Set the sauce to tomato ";
        String outputInfo3 = "********************************************* \n"
                + "Show the pizza price individually : £";
        pizza2.setSauce(sauce.Tomato);
        System.out.println(outputInfo2 + "\n \n"+ pizza2.getPizzaInfo(pizza2)
                +" \n \n" + outputInfo3 + pizza2.getTotalPriceAsString());
    }
   

}