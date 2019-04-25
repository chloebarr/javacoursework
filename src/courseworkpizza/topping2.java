/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworkpizza;

/**
 *
 * @author up888489
 */
public enum topping2 {
    None(0.00),Olives(0.08),Extra_Cheese(0.02),Chilli(0.06),Pepperoni(0.10),Mushroom(0.03),Rocket(0.05),Jalapenos(0.20),Onion(0.07),Anchovy(0.09);
    private double value;
    topping2(double value){this.value = value;}
    public double getValue(){return this.value;}
    
}
