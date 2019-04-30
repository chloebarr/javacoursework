
package courseworkpizza;
import java.util.*;

/**
 *
 * @author chloe
 */
public class Order {
    private ArrayList<Pizza> pizzas;
    
    public Order(){
        this.pizzas = new ArrayList<Pizza>();
    }
    public void addPizza(Pizza newPizza){
        pizzas.add(newPizza);
    }
    public void deletePizza(int pizzaNumber){
        pizzas.remove(pizzaNumber - 1);
    }
    public String getNumberOfPizzasAsString(){
        return ("The number of pizzas is : " + pizzas.size());
    }
    public int getNumberOfPizzas(){
        return pizzas.size();
    }
    public void updatePizzaSize(int pizzaNumber, size newSize ){
       Pizza pizzaToUpdate = pizzas.get(pizzaNumber - 1);
       if (!(pizzaToUpdate.getSize().equals(newSize))){
            pizzaToUpdate.setSize(newSize);
        }
    }
    public void updatePizzaSauce(int pizzaNumber, sauce newSauce ){
       Pizza pizzaToUpdate = pizzas.get(pizzaNumber - 1);
       if (!(pizzaToUpdate.getSauce().equals(newSauce))){
            pizzaToUpdate.setSauce(newSauce);
        }
    }
    public void updatePizzaCrust(int pizzaNumber, crust newCrust ){
       Pizza pizzaToUpdate = pizzas.get(pizzaNumber - 1);
       if (!(pizzaToUpdate.getCrust().equals(newCrust))){
            pizzaToUpdate.setCrust(newCrust);
        }
    }
    public void updatePizzaTopping1(int pizzaNumber, topping1 newTopping1 ){
       Pizza pizzaToUpdate = pizzas.get(pizzaNumber - 1);
       if (!(pizzaToUpdate.getTopping1().equals(newTopping1))){
            pizzaToUpdate.setTopping1(newTopping1);
        }
    }
    public void updatePizzaTopping2(int pizzaNumber, topping2 newTopping2 ){
       Pizza pizzaToUpdate = pizzas.get(pizzaNumber - 1);
       if (!(pizzaToUpdate.getTopping2().equals(newTopping2))){
            pizzaToUpdate.setTopping2(newTopping2);
        }
    }
    public String showOrder(){
        String orderString = "";
        for (Pizza p : pizzas){ 
            orderString += ("\n"+ "TOTAL COST : " + p.getTotalPriceAsString()
            +"\n" + "Pizza size : " + p.getSize() +" : "+ p.getSizePrice()+ "\n"
            + "Pizza crust : " + p.getCrust() +" : "+ p.getCrustPrice()+ "\n" 
            + "Pizza sauce : " + p.getSauce() + " : "+ p.getSaucePrice()+"\n" 
            + "Pizza topping : " + p.getTopping1() +" : " + p.getT1Price() 
            +" * 5 = " + p.getT1Price()*5 + "\n" + "Pizza topping : " 
            + p.getTopping2() + " : " 
            + p.getT2Price() + "* 4 = " + p.getT2Price()*4 + "\n" );
         }
        return orderString;
    }
    public Pizza getPizzaFromOrder(int pizzaNumber){
        return pizzas.get(pizzaNumber-1);
    }
    public String getTotalOrderPrice(){
        double total = 0;
        
        for (Pizza p :pizzas){
            total += p.getTotalPrice();
        }
        String stringTotal = String.format("%.2f", total);
        return stringTotal;
    }
}

