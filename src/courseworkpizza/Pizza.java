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
public class Pizza {
    private size size;
    private crust crustType;
    private sauce sauce;
    private topping1 topping1;
    private topping2 topping2;
    
public Pizza(size size, crust crustType, sauce sauce, topping1 topping1, topping2 topping2){
    this.size = size;
    this.crustType = crustType;
    this.sauce = sauce;
    this.topping1 = topping1;
    this.topping2 = topping2;
           
}


public size getSize(){return this.size;}
public crust getCrust(){return this.crustType;}
public sauce getSauce() {return sauce;}
public topping1 getTopping1() { return topping1;}
public topping2 getTopping2() { return topping2;}

public void setSize(size size){this.size = size;}
public void setCrust(crust crust){this.crustType = crust;}
public void setSauce(sauce sauce) {this.sauce = sauce;}
public void setTopping1(topping1 topping1) {this.topping1 = topping1;}
public void setTopping2(topping2 topping2) {this.topping2 = topping2;}

public String twoDP(double n)
    {
      return String.format("%.2f", n);
   }

public String getTotalPriceAsString(){
    Double total = this.crustType.getValue() + this.sauce.getValue() + this.size.getValue() + (this.topping1.getValue()*5) + (this.topping2.getValue()*4);
    return twoDP(total);
}
public Double getTotalPrice(){
    Double total = this.crustType.getValue() + this.sauce.getValue() + this.size.getValue() + (this.topping1.getValue()*5) + (this.topping2.getValue()*4);
    return total;
}
public String getBasePrice(){
    double baseCost = this.crustType.getValue() + this.sauce.getValue() + this.size.getValue();
    return twoDP(baseCost);
}
public String getSizePrice(){
    return twoDP(this.size.getValue()); 
}
public String getCrustPrice(){
    return twoDP(this.crustType.getValue());
}
public String getSaucePrice(){
    return twoDP(this.sauce.getValue());
}
public double getT1Price(){
    return this.topping1.getValue();
}
public double getT2Price(){
    return this.topping2.getValue();
}
public String getPizzaInfo(Pizza newPizza){
    return ("TOTAL COST : " + newPizza.getTotalPriceAsString() + 
        "\n" + newPizza.getSize() + " size : " + newPizza.getSizePrice() 
        + "\n" + newPizza.getCrust() + " crust : " + 
        newPizza.getCrustPrice() + "\n" + "BASE COST : " + 
        newPizza.getBasePrice() + "\n" + "topping : " + newPizza.getTopping1() 
        + " " + newPizza.getT1Price()+ " x 5 = " + 
        twoDP(newPizza.getT1Price()*5) + "\n" + "topping : " + 
        newPizza.getTopping2() + " " + newPizza.getT2Price() + " x 4 = " + 
        twoDP(newPizza.getT2Price()*4) + "\n" + newPizza.getSauce() + 
        " sauce : " + newPizza.getSaucePrice());
}
}
